package com.ma.learn.synchronization.correct;


public class PCFixed {

  public static void main(String[] args) {
    QFixed q = new QFixed();
    ProducerFixed producer = new ProducerFixed(q);
    ConsumerFixed consumer = new ConsumerFixed(q);

    producer.t.start();
    consumer.t.start();

    System.out.println("Press Ctrl + C to stop.ç");
  }
}
