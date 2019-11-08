import { Component, OnInit } from '@angular/core';
import {MusicService} from '../music.service';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  album: string = "";
  response: any;
  
  constructor(private http: HttpClient) {

   }

  ngOnInit() {
  }


  search (){
    this.http.get('http://localhost:8080/api/albumns/' +this.album)
    .subscribe((response) => {
      this.response = response;
      console.log(this.response);
    })
  }

}
