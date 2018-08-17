/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

/**
 *
 * @author apple
 */
public interface AccountFacadeLocal {
   public Account CheckAccount(int id);
   public String Payment(int id, double total);
}
