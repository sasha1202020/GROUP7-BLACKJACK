/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author aleksandrsirik
 */
public class RandomCard {

    public int DrawRandomCard() {

        int randomNum = (int) (Math.random() * 13);
        return randomNum;

    }
}
