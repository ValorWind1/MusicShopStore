import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  album: string = "";
  response: any;

  constructor(private http: HttpClient) { }

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
