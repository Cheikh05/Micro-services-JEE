import { Component, OnInit } from '@angular/core';
import {FormationServices} from "../services/FormationServices";
import {Subscription} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-formations',
  templateUrl: './formations.component.html',
  styleUrls: ['./formations.component.css']
})
export class FormationsComponent implements OnInit {
  public formations:any;
  public listEtudiant:any;
  formationCourante:any=-1;
  // formSubcription:Subscription;

  constructor(private http:HttpClient) { }

  ngOnInit() {
   this.http.get("http://localhost:8080/formations")
     .subscribe(
       (data)=>{
         this.formations = data;
       },
       (err)=>{
         console.log("Erreur :"+err);
       }
     );



  }

  onGetAllStudents(f){
    this.formationCourante=f;
    this.http.get("http://localhost:8080/formations/"+f.id+"/etudiants")
      .subscribe(
        (data)=>{
          this.listEtudiant = data;
        },
        (err)=>{
          console.log("Erreur :"+err);
        }
      );
  }

}
