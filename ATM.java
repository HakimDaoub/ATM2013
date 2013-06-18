/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omar
 */
public class ATM {
 
    private Keypad         keypad          = new Keypad (); 
    private Screen         screen          = new Screen();
    private CashDispenser  cashDispenser   = new CashDispenser();
    private DepositSolt    depositSolt     = new DepositSolt();
    private BankDatabase   bankDatabase     = new BankDatabase();
    private Transaction    transaction     = new Transaction();   
    private boolean        userAuthenticated= false;
    
    public void displayPromptMessage(){
       screen.displayMessage("Please enter your account number:"); 
    }
    
     public  int getAccountNumber(){
       return Keypad.getInput; 
    }
    
    
}
