package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrw_1 extends rrrn_1 {
   private static final Logger id_protected = LogManager.getLogger();
   protected rrPl_1 id_class;
   protected rrPN id_break;
   protected rfH_2 id_byte;

   public rrrw_1(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public rrrw_1(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.id_byte = new rfH_2(var2.id_private("TPX"), var2.id_private("TPY"), var2.id_private("TPZ"));
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.id_break.id_class(var5);
      this.id_final = this.id_class.id_break(this.id_break, this.id_byte);
      if (this.id_class.id_class(var1, this.id_byte, var7, this.id_break, var4, 2)) {
         for (rrPp_1 var9 : this.id_class.id_class(this.id_byte, this.id_break, xu_3.Js)) {
            if (var9.id_byte != null) {
               rCD var10 = rCD.valueOf(var9.id_byte.id_native("mode"));
               if (var10 == rCD.DATA) {
                  this.id_class(var9.id_byte.id_native("metadata"), var9.id_class, var1, var4, var5);
               }
            }
         }

         for (rrPp_1 var16 : this.id_class.id_class(this.id_byte, this.id_break, xu_3.JE)) {
            if (var16.id_byte != null) {
               String var17 = var16.id_byte.id_native("final_state");
               Rk_1 var11 = new Rk_1(new StringReader(var17), false);
               xc_3 var12 = xu_3.id_class.id_continue();

               try {
                  var11.id_class(true);
                  xc_3 var13 = var11.id_break();
                  if (var13 != null) {
                     var12 = var13;
                  } else {
                     id_protected.error("Error while parsing blockstate {} in jigsaw block @ {}", var17, var16.id_class);
                  }
               } catch (CommandSyntaxException var14) {
                  id_protected.error("Error while parsing blockstate {} in jigsaw block @ {}", var17, var16.id_class);
               }

               var1.id_class(var16.id_class, var12, 3);
            }
         }
      }

      return true;
   }

   @Override
   public rqd_3 id_class() {
      return this.id_break.id_protected();
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      super.id_class(var1, var2, var3);
      this.id_byte = this.id_byte.id_break(var1, var2, var3);
   }

   protected abstract void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5);

   protected void id_class(rrPl_1 var1, rfH_2 var2, rrPN var3) {
      this.id_class = var1;
      this.id_class(rpr_3.NORTH);
      this.id_byte = var2;
      this.id_break = var3;
      this.id_final = var1.id_break(var3, var2);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("TPX", this.id_byte.b_());
      var1.id_break("TPY", this.id_byte.c_());
      var1.id_break("TPZ", this.id_byte.d_());
   }
}
