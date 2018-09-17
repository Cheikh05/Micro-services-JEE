import { Component, OnInit } from '@angular/core';
import {FormationServices} from "../services/FormationServices";

@Component({
  selector: 'app-etud',
  templateUrl: './etudiants.component.html',
  styleUrls: ['./etudiants.component.css']
})
export class EtudiantsComponent implements OnInit {
public listeEtudiants:any=["iijjkjk"];
  constructor(private services:FormationServices) { }

  ngOnInit() {
    this.services.init();
    this.listeEtudiants = this.services.listEtudiant;
  }

}
