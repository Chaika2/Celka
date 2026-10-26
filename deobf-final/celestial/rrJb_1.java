package celestial;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;

public class rrJb_1 extends rrJM {
   private final vm_3 class_;
   private String private_;
   private long implements_;
   private String finally_;
   private rrXi_1 else_;

   public rrJb_1(vm_3 var1) {
      super(new rgN_2(jI_2.class_("of.options.capeOF.title")));
      this.class_ = var1;
   }

   private void class_(String var1, long var2) {
      this.private_ = var1;
      this.implements_ = System.currentTimeMillis() + var2;
      this.class_((String)null);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.case_, this.extends_, this.package_ / 2, 20, 16777215);
      if (this.private_ != null) {
         class_(var1, this.case_, this.private_, this.package_ / 2, this.int_ / 6 + 60, 16777215);
         if (System.currentTimeMillis() > this.implements_) {
            this.private_ = null;
            this.class_((String)null);
         }
      }

      super.class_(var1, var2, var3, var4);
   }

   public void class_(String var1) {
      this.finally_ = var1;
      this.else_.new_ = var1 != null;
   }

   @Override
   protected void break_(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.int_) {
         if (var2.class_ == 200) {
            this.volatile_.break_(this.class_);
         }

         if (var2.class_ == 210) {
            try {
               String var3 = this.volatile_.while_().throws_().getName();
               String var4 = this.volatile_.while_().throws_().getId().toString().replace("-", "");
               String var5 = this.volatile_.while_().protected_();
               Random var6 = new Random();
               Random var7 = new Random((long)System.identityHashCode(new Object()));
               BigInteger var8 = new BigInteger(128, var6);
               BigInteger var9 = new BigInteger(128, var7);
               BigInteger var10 = var8.xor(var9);
               String var11 = var10.toString(16);
               this.volatile_.r().joinServer(this.volatile_.while_().throws_(), var5, var11);
               String var12 = "https://optifine.net/capeChange?u=" + var4 + "&n=" + var3 + "&s=" + var11;
               boolean var13 = rrbb_3.class_(new URI(var12));
               if (var13) {
                  this.class_(rrba_3.class_("of.message.capeOF.openEditor"), 10000L);
               } else {
                  this.class_(rrba_3.class_("of.message.capeOF.openEditorError"), 10000L);
                  this.class_(var12);
               }
            } catch (InvalidCredentialsException var14) {
               rrbb_3.byte_(jI_2.class_("of.message.capeOF.error1"), jI_2.class_("of.message.capeOF.error2", var14.getMessage()));
               rrbb_3.protected_("Mojang authentication failed");
               rrbb_3.protected_(var14.getClass().getName() + ": " + var14.getMessage());
            } catch (Exception var15) {
               rrbb_3.protected_("Error opening OptiFine cape link");
               rrbb_3.protected_(var15.getClass().getName() + ": " + var15.getMessage());
            }
         }

         if (var2.class_ == 220) {
            this.class_(rrba_3.class_("of.message.capeOF.reloadCape"), 15000L);
         }

         if (var2.class_ == 230 && this.finally_ != null) {
            ((Qj_1)this.volatile_.class_[23]).class_(this.finally_);
         }
      }
   }

   @Override
   protected void v_() {
      int var1 = 0;
      var1 += 2;
      this.class_(new rrXi_1(210, this.package_ / 2 - 155, this.int_ / 6 + 24 * (var1 >> 1), 150, 20, jI_2.class_("of.options.capeOF.openEditor")));
      this.class_(new rrXi_1(220, this.package_ / 2 - 155 + 160, this.int_ / 6 + 24 * (var1 >> 1), 150, 20, jI_2.class_("of.options.capeOF.reloadCape")));
      var1 += 6;
      this.else_ = new rrXi_1(230, this.package_ / 2 - 100, this.int_ / 6 + 24 * (var1 >> 1), 200, 20, jI_2.class_("of.options.capeOF.copyEditorLink"));
      this.else_.new_ = this.finally_ != null;
      this.class_(this.else_);
      var1 += 4;
      this.class_(new rrXi_1(200, this.package_ / 2 - 100, this.int_ / 6 + 24 * (var1 >> 1), jI_2.class_("gui.done")));
   }
}
