package celestial;

import java.awt.Dimension;

public class rrJR {
   private Dimension id_private = null;
   private boolean id_implements = false;
   private rrJo_1[] id_finally = new rrJo_1[0];
   private rqO_2 id_extends = null;
   private fN_2 id_native = null;
   private fk_3 id_volatile = null;
   private rqO_2 id_final = new rqO_2("textures/block/red_wool.png");
   public static final int id_class = 0;
   public static final int id_break = 1;
   public static final int id_byte = 2;
   public static final int id_protected = 3;
   public static final int id_throws = 4;
   public static final int id_case = 5;
   public static final int id_catch = 6;

   public rqO_2 id_byte() {
      return this.id_extends;
   }

   public rrJR(Dimension var1, boolean var2, rrJo_1[] var3) {
      this.id_private = var1;
      this.id_implements = var2;
      this.id_finally = var3;
   }

   public void id_class(rqO_2 var1) {
      this.id_extends = var1;
   }

   public void id_class(fN_2 var1) {
      this.id_native = var1;
   }

   public void id_class(tW_2 var1, cG_2 var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      rqO_2 var7 = this.id_final;
      if (this.id_implements) {
         var7 = var2.id_final();
      } else if (this.id_extends != null) {
         if (this.id_volatile == null && this.id_native != null) {
            this.id_volatile = new fk_3(this.id_native);
            QY.id_instanceof().A().id_class(this.id_extends, this.id_volatile);
         }

         var7 = this.id_extends;
      } else {
         var7 = this.id_final;
      }

      for (int var8 = 0; var8 < this.id_finally.length; var8++) {
         rrJo_1 var9 = this.id_finally[var8];
         var3.id_class();
         HU var10 = HU.id_protected(var7);
         Ok_1 var11 = var4.getBuffer(var10);
         var9.id_class(var1, var3, var11, var5, var6);
         var3.id_break();
      }
   }

   public static Iq_1 id_class(tW_2 var0, int var1) {
      switch (var1) {
         case 0:
            return var0.id_byte;
         case 1:
            return var0.id_class;
         case 2:
            return var0.id_throws;
         case 3:
            return var0.id_protected;
         case 4:
            return var0.id_catch;
         case 5:
            return var0.id_case;
         default:
            return null;
      }
   }

   public fN_2 id_class() {
      return this.id_native;
   }

   public fk_3 id_break() {
      return this.id_volatile;
   }

   public boolean id_protected() {
      return this.id_implements;
   }
}
