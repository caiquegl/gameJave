/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author caiquegl
 */
public class ControllerPontuacao {
    
    static int pontuacaoTotal = 0;

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }
    public void setAddPontuacaoTotal(int pont) {
        int newPoint = pontuacaoTotal + pont;
        pontuacaoTotal = newPoint;
    }
    public void setRemovePontuacaoTotal(int pont) {
        int newPoint = pontuacaoTotal - pont;
        pontuacaoTotal = newPoint;
    }
    public void setZerarPontuacao() {
        pontuacaoTotal = 0;
    }
    
}
