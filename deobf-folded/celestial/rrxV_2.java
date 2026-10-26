package celestial;

public class rrxV_2 implements rrxa_3 {
   private int id_protected = -1;
   private rqO_2 id_throws;
   private int id_case = 0;
   private ff_3 id_catch;
   public static final int id_class = 0;
   public static final int id_break = 1;
   public static final int id_byte = 2;

   public void id_byte() {
      this.id_catch = null;
   }

   public rrxV_2(int var1, rqO_2 var2, int var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   @Override
   public String toString() {
      return "textureUnit: " + this.id_protected + ", location: " + this.id_throws + ", glTextureId: " + (this.id_catch != null ? this.id_catch.id_new() : "");
   }

   @Override
   public int id_class() {
      return this.id_protected;
   }

   public ff_3 id_break() {
      if (this.id_catch == null) {
         fY_2 var1 = QY.id_instanceof().A();
         this.id_catch = var1.id_break(this.id_throws);
         if (this.id_catch == null) {
            this.id_catch = new fH_2(this.id_throws);
            var1.id_class(this.id_throws, this.id_catch);
            this.id_catch = var1.id_break(this.id_throws);
         }
      }

      return this.id_catch;
   }

   @Override
   public void id_throws() {
   }

   @Override
   public int id_protected() {
      ff_3 var1 = this.id_break();
      if (this.id_case != 0 && var1 instanceof ff_3) {
         rrdE var2 = var1.id_implements;
         if (var2 != null) {
            if (this.id_case == 1) {
               return var2.id_break;
            }

            if (this.id_case == 2) {
               return var2.id_byte;
            }
         }
      }

      return var1.id_new();
   }
}
