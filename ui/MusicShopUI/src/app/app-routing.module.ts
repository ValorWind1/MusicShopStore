import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {MusicComponent} from './music/music.component';
import { ArtComponent } from './art/art.component';
import { AboutComponent } from './about/about.component';


const routes: Routes = [
{path: '', redirectTo: 'home', pathMatch: 'full'}, // default path
{path:'home', component:HomeComponent},
{path: 'music', component:MusicComponent},
{path: 'art', component:ArtComponent},
{path : 'about', component:AboutComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes),

  
  
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
