import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EtudiantsComponent } from './etudiants/etudiants.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { FormationsComponent } from './formations/formations.component';
import {FormationServices} from "./services/FormationServices";
import {EtudiantServices} from "./services/EtudiantServices";

@NgModule({
  declarations: [
    AppComponent,
    EtudiantsComponent,
    FormationsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    FormationServices,
    EtudiantServices
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
