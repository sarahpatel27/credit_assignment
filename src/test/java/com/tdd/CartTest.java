package com.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {
    @Test
    public void emptycart(){
        //Setup
        int items=0;
        //Execute
        Cart cart=new Cart();
        int item=cart.getItem();
        //assert
        assertEquals(items, item);
    }

    @Test
    public void SumOfItems(){
        //Setup
        int items=1400;
        //Execute
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,2);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getTotalSum();
        //Asset
        assertEquals(items, sum);

    }

    @Test
    public void SumOfQty(){
        //Setup
        int Qty=3;
        //Execute
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,1);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getQtyUpdate();
        //Asset
        assertEquals(Qty, sum);
    }

    @Test
    public void PriceAndQty(){
        //Setup
        int Qty=2;
        //
        Cart cart1=new Cart("Meezan Oil",700,2);
        Cart cart2=new Cart("Meezan Oil",700,1);
        Cart cart=new Cart();
        cart.add(cart1);
        cart.add(cart2);
        int sum=cart.getPriceAndQty();
        //Asset
        assertEquals(Qty, sum);

    }
}

