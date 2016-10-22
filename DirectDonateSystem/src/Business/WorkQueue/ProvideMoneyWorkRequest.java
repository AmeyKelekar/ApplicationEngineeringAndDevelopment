/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Amey
 */
public class ProvideMoneyWorkRequest extends WorkRequest{
    private String provideFunds;

    public String getProvideFunds() {
        return provideFunds;
    }

    public void setProvideFunds(String provideFunds) {
        this.provideFunds = provideFunds;
    }
}
