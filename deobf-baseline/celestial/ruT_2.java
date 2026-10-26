package celestial;

public final class ruT_2 extends RuntimeException {
   public static final ruT_2 id_class = new ruT_2();

   private ruT_2() {
      this.setStackTrace(new StackTraceElement[0]);
   }

   @Override
   public synchronized Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }
}
