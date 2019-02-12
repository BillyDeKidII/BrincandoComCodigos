import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';

/**
 * Generated class for the ExtraPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-extra',
  templateUrl: 'extra.html',
})
export class ExtraPage {
   public nomeTeste:string = "FUNCIONA SIM";
  constructor(public navCtrl: NavController, public navParams: NavParams) {
  }

 public alertaPaginaExtra(): void {
     alert("Pagina especial apenas para testes!!!!");
     alert("Informe os bug e erros para : thiaroll@gmail.com")
 }
    
  ionViewDidLoad() {
    this.alertaPaginaExtra();
    console.log('ionViewDidLoad ExtraPage');
  }

}
