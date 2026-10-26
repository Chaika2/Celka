package celestial;

public class rrxB_2 implements rrJi_1 {
   private String id_class = null;
   private boolean id_break = false;
   private Class id_byte = null;

   public boolean id_byte() {
      return this.id_break() != null;
   }

   public rrxB_2(String var1) {
      this.id_class = var1;
      rrxM_2.id_class(this);
   }

   public rrxB_2(Class var1) {
      this.id_byte = var1;
      this.id_class = var1.getName();
      this.id_break = true;
   }

   public rrxs_3 id_class(String var1) {
      return new rrxs_3(this, var1);
   }

   public rrxG_2 id_class(String var1, Class[] var2) {
      return new rrxG_2(this, var1, var2);
   }

   public rrxS_2 id_class(Class[] var1) {
      return new rrxS_2(this, var1);
   }

   @Override
   public void id_class() {
      Class var1 = this.id_break();
   }

   public boolean id_class(Object var1) {
      return this.id_break() == null ? false : this.id_break().isInstance(var1);
   }

   public Class id_break() {
      if (this.id_break) {
         return this.id_byte;
      } else {
         this.id_break = true;

         try {
            this.id_byte = Class.forName(this.id_class);
         } catch (ClassNotFoundException var2) {
            rrMP.id_throws("(Reflector) Class not present: " + this.id_class);
         } catch (Throwable var3) {
            var3.printStackTrace();
         }

         return this.id_byte;
      }
   }

   public rrxG_2 id_break(String var1) {
      return new rrxG_2(this, var1);
   }

   public String id_protected() {
      return this.id_class;
   }
}
