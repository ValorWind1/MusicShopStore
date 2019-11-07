import { Component } from '@angular/core';
import { MusicService } from './music.service';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MusicShopUI';

  constructor(private svc: MusicService, private http: HttpClient){
    this.svc.printToConsole("Got the service!");
  }

  ngOnInit(){

   let obs =  this.http.get('http://localhost:8080/api/albumns')

   obs.subscribe(()=> console.log('Got The response'));

  }

}
