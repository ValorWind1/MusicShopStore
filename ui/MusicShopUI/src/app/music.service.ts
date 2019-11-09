import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpEvent, HttpHandler, HttpRequest, HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Songs} from './Songs';

@Injectable({providedIn: 'root'})
export class HeaderInterceptor implements HttpInterceptor {
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return next.handle(req);
  }
}

@Injectable({
  providedIn: 'root'

})
export class MusicService {

  private endpoint = 'http://localhost:8080/api/albumns';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'text/xml'
    })
  };

  constructor(private http: HttpClient) {
  }

// get
getSong(): Observable<Songs[]> {
  
  return (this.http.get<Songs[]>(this.endpoint));
}
// update(put)
updateSong(song: Songs): Observable<any> {
  return this.http.put(this.endpoint, JSON.stringify(song), this.httpOptions);

}
// delete
deleteSong(id: number): Observable<{}> {
  const url = `${this.endpoint}/${id}`; // DELETE api/heroes/42
  return this.http.delete(url, this.httpOptions);
}

// post
addSong(song: Songs): Observable<any> {
  return this.http.post(this.endpoint, JSON.stringify(song), this.httpOptions);
  
}
  printToConsole (arg) {
    console.log(arg);
  }

}