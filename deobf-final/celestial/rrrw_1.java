package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rrrw_1 extends rrrn_1 {
   private static final Logger protected_ = LogManager.getLogger();
   protected rrPl_1 class_;
   protected rrPN break_;
   protected rfH_2 byte_;

   public rrrw_1(raF_2 var1, int var2) {
      super(var1, var2);
   }

   public rrrw_1(raF_2 var1, rcd_3 var2) {
      super(var1, var2);
      this.byte_ = new rfH_2(var2.private_("TPX"), var2.private_("TPY"), var2.private_("TPZ"));
   }

   @Override
   public boolean class_(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      this.break_.class_(var5);
      this.final_ = this.class_.break_(this.break_, this.byte_);
      if (this.class_.class_(var1, this.byte_, var7, this.break_, var4, 2)) {
         for (rrPp_1 var9 : this.class_.class_(this.byte_, this.break_, xu_3.Js)) {
            if (var9.byte_ != null) {
               rCD var10 = rCD.valueOf(var9.byte_.native_("mode"));
               if (var10 == rCD.DATA) {
                  this.class_(var9.byte_.native_("metadata"), var9.class_, var1, var4, var5);
               }
            }
         }

         for (rrPp_1 var16 : this.class_.class_(this.byte_, this.break_, xu_3.JE)) {
            if (var16.byte_ != null) {
               String var17 = var16.byte_.native_("final_state");
               Rk_1 var11 = new Rk_1(new StringReader(var17), false);
               xc_3 var12 = xu_3.class_.continue_();

               try {
                  var11.class_(true);
                  xc_3 var13 = var11.break_();
                  if (var13 != null) {
                     var12 = var13;
                  } else {
                     protected_.error("Error while parsing blockstate {} in jigsaw block @ {}", var17, var16.class_);
                  }
               } catch (CommandSyntaxException var14) {
                  protected_.error("Error while parsing blockstate {} in jigsaw block @ {}", var17, var16.class_);
               }

               var1.class_(var16.class_, var12, 3);
            }
         }
      }

      return true;
   }

   @Override
   public rqd_3 class_() {
      return this.break_.protected_();
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      this.byte_ = this.byte_.break_(var1, var2, var3);
   }

   protected abstract void class_(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5);

   protected void class_(rrPl_1 var1, rfH_2 var2, rrPN var3) {
      this.class_ = var1;
      this.class_(rpr_3.NORTH);
      this.byte_ = var2;
      this.break_ = var3;
      this.final_ = var1.break_(var3, var2);
   }

   @Override
   protected void class_(rcd_3 var1) {
      var1.break_("TPX", this.byte_.b_());
      var1.break_("TPY", this.byte_.c_());
      var1.break_("TPZ", this.byte_.d_());
   }
}
