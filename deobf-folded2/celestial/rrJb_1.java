package celestial;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;

public class rrJb_1 extends rrJM {
   private final vm_3 id_class;
   private String id_private;
   private long id_implements;
   private String id_finally;
   private rrXi_1 id_else;

   public rrJb_1(vm_3 var1) {
      super(new rgN_2(jI_2.id_class("of.options.capeOF.title")));
      this.id_class = var1;
   }

   private void id_class(String var1, long var2) {
      this.id_private = var1;
      this.id_implements = System.currentTimeMillis() + var2;
      this.id_class((String)null);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_case, this.id_extends, this.id_package / 2, 20, 16777215);
      if (this.id_private != null) {
         id_class(var1, this.id_case, this.id_private, this.id_package / 2, this.id_int / 6 + 60, 16777215);
         if (System.currentTimeMillis() > this.id_implements) {
            this.id_private = null;
            this.id_class((String)null);
         }
      }

      super.id_class(var1, var2, var3, var4);
   }

   public void id_class(String var1) {
      this.id_finally = var1;
      this.id_else.id_new = var1 != null;
   }

   @Override
   protected void id_break(LZ var1) {
      if (var1 instanceof rrXi_1 var2 && var2.id_int) {
         if (var2.id_class == 200) {
            this.id_volatile.id_break(this.id_class);
         }

         if (var2.id_class == 210) {
            try {
               String var3 = this.id_volatile.id_while().id_throws().getName();
               String var4 = this.id_volatile.id_while().id_throws().getId().toString().replace("-", "");
               String var5 = this.id_volatile.id_while().id_protected();
               Random var6 = new Random();
               Random var7 = new Random((long)System.identityHashCode(new Object()));
               BigInteger var8 = new BigInteger(128, var6);
               BigInteger var9 = new BigInteger(128, var7);
               BigInteger var10 = var8.xor(var9);
               String var11 = var10.toString(16);
               this.id_volatile.r().joinServer(this.id_volatile.id_while().id_throws(), var5, var11);
               String var12 = "https://optifine.net/capeChange?u=" + var4 + "&n=" + var3 + "&s=" + var11;
               boolean var13 = rrbb_3.id_class(new URI(var12));
               if (var13) {
                  this.id_class(rrba_3.id_class("of.message.capeOF.openEditor"), 10000L);
               } else {
                  this.id_class(rrba_3.id_class("of.message.capeOF.openEditorError"), 10000L);
                  this.id_class(var12);
               }
            } catch (InvalidCredentialsException var14) {
               rrbb_3.id_byte(jI_2.id_class("of.message.capeOF.error1"), jI_2.id_class("of.message.capeOF.error2", var14.getMessage()));
               rrbb_3.id_protected("Mojang authentication failed");
               rrbb_3.id_protected(var14.getClass().getName() + ": " + var14.getMessage());
            } catch (Exception var15) {
               rrbb_3.id_protected("Error opening OptiFine cape link");
               rrbb_3.id_protected(var15.getClass().getName() + ": " + var15.getMessage());
            }
         }

         if (var2.id_class == 220) {
            this.id_class(rrba_3.id_class("of.message.capeOF.reloadCape"), 15000L);
         }

         if (var2.id_class == 230 && this.id_finally != null) {
            ((Qj_1)this.id_volatile.id_class[23]).id_class(this.id_finally);
         }
      }
   }

   @Override
   protected void v_() {
      int var1 = 0;
      var1 += 2;
      this.id_class(new rrXi_1(210, this.id_package / 2 - 155, this.id_int / 6 + 24 * (var1 >> 1), 150, 20, jI_2.id_class("of.options.capeOF.openEditor")));
      this.id_class(
         new rrXi_1(220, this.id_package / 2 - 155 + 160, this.id_int / 6 + 24 * (var1 >> 1), 150, 20, jI_2.id_class("of.options.capeOF.reloadCape"))
      );
      var1 += 6;
      this.id_else = new rrXi_1(230, this.id_package / 2 - 100, this.id_int / 6 + 24 * (var1 >> 1), 200, 20, jI_2.id_class("of.options.capeOF.copyEditorLink"));
      this.id_else.id_new = this.id_finally != null;
      this.id_class(this.id_else);
      var1 += 4;
      this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 24 * (var1 >> 1), jI_2.id_class("gui.done")));
   }
}
