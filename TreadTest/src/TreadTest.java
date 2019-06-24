public class TreadTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      CounterThread c = new CounterThread();
      c.start();
      
      Thread CounterRU = new Thread(new CounterRunnable());
      CounterRU.start();
      
      for (int i =0 ;i<10;i++ )
      {
    	  if(i == 7)
          {   
             c.clearFlag();

          }
         System.out.println("main : "+ Thread.currentThread()
         + "count"+i);
         
      }
      try {
         Thread.sleep(1000);
      }catch(InterruptedException e) {
         e.printStackTrace();
      }
   }
   

    private static class CounterThread extends Thread{
	  public void clearFlag()
	  {
	     mFlag = false;
	  }
      private boolean mFlag = true;
      @Override
      public void run() {
         // TODO Auto-generated method stub
         //super.run();
         for (int i =0 ;i<10;i++ )
         {
            if(mFlag == false)//mFlag 사용시 멈추지 않고 계속 실행
            {
               return;
            }
            System.out.println("[/ : "+ getName()+"]  count"+i);
            try{Thread.sleep(1000);
            
            }catch(InterruptedException e) {
               e.printStackTrace();
            }
            catch(Exception e) {
            	System.out.println("걍안되는 거다");
            }
         }
         
      }
      
      
   }
   private static class CounterRunnable implements Runnable{
      public void run() {
         // TODO Auto-generated method stub
         //super.run();
         CounterRunnable c = new CounterRunnable();
      
         for (int i =0 ;i<10;i++ )
         {
            System.out.println("Runnable : "+ Thread.currentThread()
            + "count"+i);   
            try {Thread.sleep(1000);
               
            }catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }
}

