package celestial;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

class rrkW extends rrJh_1 {
   private ArrayList id_synchronized;
   private int id_return;
   private long id_public = Long.MIN_VALUE;
   private long id_goto = 0L;
   final rrkx_1 id_else;

   @Override
   public int id_int() {
      return this.id_protected() * 18;
   }

   public rrkW(rrkx_1 var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1.id_native(), var2, var3, var4, var5, var6);
      this.id_else = var1;
      this.id_new();
      this.id_int = 0.0;
      int var7 = this.id_return * var6;
      int var8 = (var5 - var4) / 2;
      if (var7 > var8) {
         this.id_protected(var7 - var8);
      }
   }

   private boolean id_class(rrxi_3 var1, int var2) {
      if (var1 == null) {
         return true;
      } else {
         InputStream var3 = var1.id_class("/shaders/shaders.properties");
         Properties var4 = rrzM_2.id_class(var3, "Shaders");
         if (var4 == null) {
            return true;
         } else {
            String var5 = "version.1.16.5";
            String var6 = var4.getProperty(var5);
            if (var6 == null) {
               return true;
            } else {
               var6 = var6.trim();
               String var7 = "G8";
               int var8 = rrbb_3.id_break(var7, var6);
               if (var8 >= 0) {
                  return true;
               } else {
                  String var9 = ("HD_U_" + var6).replace('_', ' ');
                  String var10 = jI_2.id_class("of.message.shaders.nv1", var9);
                  String var11 = jI_2.id_class("of.message.shaders.nv2");
                  BooleanConsumer var12 = var2x -> {
                     if (var2x) {
                        this.id_catch(var2);
                     }

                     this.id_case.id_break(this.id_else);
                  };
                  mT_2 var13 = new mT_2(var12, new rgN_2(var10), new rgN_2(var11));
                  this.id_case.id_break(var13);
                  return false;
               }
            }
         }
      }
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      return super.id_class(var1, var3, var5 * 3.0);
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      String var9 = (String)this.id_synchronized.get(var2);
      if (var9.equals("OFF")) {
         var9 = rrba_3.id_class("of.options.shaders.packNone");
      } else if (var9.equals("(internal)")) {
         var9 = rrba_3.id_class("of.options.shaders.packDefault");
      }

      this.id_else.id_class(var1, var9, this.id_catch / 2, var4 + 1, 14737632);
   }

   @Override
   protected boolean id_class(int var1, int var2, double var3, double var5) {
      if (var1 == this.id_return && this.id_public == this.id_goto) {
         return false;
      } else {
         String var7 = (String)this.id_synchronized.get(var1);
         rrxi_3 var8 = rrdZ.id_break(var7);
         if (!this.id_class(var8, var1)) {
            return false;
         } else {
            this.id_catch(var1);
            return true;
         }
      }
   }

   @Override
   protected boolean id_break(int var1) {
      return var1 == this.id_return;
   }

   private void id_catch(int var1) {
      this.id_return = var1;
      this.id_goto = this.id_public;
      rrdZ.id_class((String)this.id_synchronized.get(var1));
      rrdZ.id_while();
      this.id_else.id_finally();
   }

   public int id_continue() {
      return this.id_return;
   }

   public void id_new() {
      this.id_synchronized = rrdZ.id_catch();
      this.id_return = 0;
      int var1 = 0;

      for (int var2 = this.id_synchronized.size(); var1 < var2; var1++) {
         if (((String)this.id_synchronized.get(var1)).equals(rrdZ.sP)) {
            this.id_return = var1;
            break;
         }
      }
   }

   @Override
   protected int id_package() {
      return this.id_catch - 6;
   }

   @Override
   protected int id_protected() {
      return this.id_synchronized.size();
   }

   @Override
   protected void id_private() {
   }

   @Override
   public int id_volatile() {
      return this.id_catch - 20;
   }
}
