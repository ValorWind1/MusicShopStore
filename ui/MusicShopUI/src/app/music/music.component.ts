import { Component, OnInit } from '@angular/core';
import { Songs } from '../Songs';
import { MusicService} from '../music.service';


@Component({
  selector: 'app-music',
  templateUrl: './music.component.html',
  styleUrls: ['./music.component.css']
})
export class MusicComponent implements OnInit {

  Artist_name;
  songs: Songs[];
  active = false;


  constructor( private service : MusicService) { }

  
  getSong(): void {
    this.service.getSong()
    .subscribe(item => {this.songs = item; this.setRealID();});
  }
  
  setRealID() {
    for (let i = 0; i < this.songs.length; i++) {
      this.songs[i].realId = i + 1;
    }
  }

  getInput(n: string) {
    n = n[0].toUpperCase() + n.substr(1).toLowerCase();
    this.Artist_name = n;
    this.active = true;
    if (n.length === 0) {
      this.active = false;
    }

  }

  async delay(ms: number, item: Songs) {
    await new Promise(resolve => setTimeout(() => resolve(), ms)).then(() => item.hideAlert = false);
  }
  

  
  ngOnInit() {
    this.getSong();
  }

}
