package com.ma.learn.stringhandling;

import  java.util.List;





public  class  SplitOrders  {

    public  class  Item{



        /**

         *  卖家用户id

         */

        long  sellerId;



        /**

         *  商品价格，单位分

         */

        long  price;

    }

    public  class  Order{



        /**

         *  该订单对应的商品

         */

        List<Item>  orderItems;



        /**

         *  该订单金额，单位分

         */

        long  totalPrice;



        /**

         *  该订单对应的卖家userId

         */

        long  sellerId;

    }

    /**
     *  根据购物车的商品，生成相应的交易订单--所有商品属于同一个买家，根据如下规则
     *
     *  1.每笔交易订单可以有多个商品
     *  2.每笔交易订单的商品只能是同一个卖家
     *  3.每笔交易商品的总价格不能超过1000元
     *  4.生成的交易订单数量最小
     *  @param  items：购物车所有商品
     */

    public  List<Order>  packageItemsToOrders(List<Item>  items){
        return  null;

    }



    /**
     *  @param  args
     */
    public  static  void  main(String[]  args)  {
        //  TODO  Auto-generated  method  stub


    }



}