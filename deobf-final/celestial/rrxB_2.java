package celestial;

public class rrxB_2 implements rrJi_1 {
   private String class_ = null;
   private boolean break_ = false;
   private Class byte_ = null;

   public boolean byte_() {
      return this.break_() != null;
   }

   public rrxB_2(String var1) {
      this.class_ = var1;
      rrxM_2.class_(this);
   }

   public rrxB_2(Class var1) {
      this.byte_ = var1;
      this.class_ = var1.getName();
      this.break_ = true;
   }

   public rrxs_3 class_(String var1) {
      return new rrxs_3(this, var1);
   }

   public rrxG_2 class_(String var1, Class[] var2) {
      return new rrxG_2(this, var1, var2);
   }

   public rrxS_2 class_(Class[] var1) {
      return new rrxS_2(this, var1);
   }

   @Override
   public void class_() {
      Class var1 = this.break_();
   }

   public boolean class_(Object var1) {
      return this.break_() == null ? false : this.break_().isInstance(var1);
   }

   public Class break_() {
      if (this.break_) {
         return this.byte_;
      } else {
         this.break_ = true;

         try {
            this.byte_ = Class.forName(this.class_);
         } catch (ClassNotFoundException var2) {
            rrMP.throws_("(Reflector) Class not present: " + this.class_);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return this.byte_;
      }
   }

   public rrxG_2 break_(String var1) {
      return new rrxG_2(this, var1);
   }

   public String protected_() {
      return this.class_;
   }
}
