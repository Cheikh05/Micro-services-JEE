import {Injectable, OnInit} from "@angular/core";
import { Subject} from "rxjs";
import {HttpClient} from "@angular/common/http";



@Injectable()
export  class FormationServices{
  private formations:any;
  public listEtudiant:any;
  formationSubject = new Subject<any[]>();
  idFormtion:number=1;


  constructor(private http:HttpClient){

  }

  init(){
    this.http.get("http://localhost:8080/formations")
      .subscribe(
        data=>{
          this.formations = data;
        },
        err=>{
          console.log("Erreur : "+err);
        }
      );
    this.http.get("http://localhost:8080/formations/"+this.idFormtion+"/etudiants")
      .subscribe(data=>
      {
         this.listEtudiant = data;
      });
  }




  getFormation(){
    return this.formations;
  }

}
