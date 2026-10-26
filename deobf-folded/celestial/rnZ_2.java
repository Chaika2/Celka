package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnZ_2 extends rCr_1 {
   private static final Logger id_case = LogManager.getLogger();

   @Override
   public boolean id_byte(GameProfile var1) {
      return !this.id_int() || this.id_case(var1) || this.id_finally().id_class(var1);
   }

   public rnZ_2(rnv_3 var1, rVv_1 var2, rrGx_1 var3) {
      super(var1, var2, var3, var1.id_class().id_import);
      rnp_3 var4 = var1.id_class();
      this.id_class(var4.id_static);
      super.id_class((Boolean)var4.P.get());
      this.id_goto();
      this.id_return();
      this.id_public();
      this.id_synchronized();
      this.id_while();
      this.id_instanceof();
      this.id_try();
      if (!this.id_finally().id_break().exists()) {
         this.id_throw();
      }
   }

   @Override
   public void id_class(GameProfile var1) {
      super.id_class(var1);
      this.id_try();
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_break().id_finally(var1);
   }

   @Override
   public void id_class() {
      this.id_instanceof();
   }

   public rnv_3 id_break() {
      return (rnv_3)super.id_byte();
   }

   @Override
   public void id_break(GameProfile var1) {
      super.id_break(var1);
      this.id_try();
   }

   private void id_goto() {
      try {
         this.id_catch().id_case();
      } catch (IOException var2) {
         id_case.warn("Failed to load user banlist: ", var2);
      }
   }

   private void id_instanceof() {
      try {
         this.id_finally().id_case();
      } catch (Exception var2) {
         id_case.warn("Failed to load white-list: ", var2);
      }
   }

   private void id_return() {
      try {
         this.id_catch().id_throws();
      } catch (IOException var2) {
         id_case.warn("Failed to save user banlist: ", var2);
      }
   }

   private void id_throw() {
      try {
         this.id_finally().id_throws();
      } catch (Exception var2) {
         id_case.warn("Failed to save white-list: ", var2);
      }
   }

   private void id_try() {
      try {
         this.id_native().id_throws();
      } catch (Exception var2) {
         id_case.warn("Failed to save operators list: ", var2);
      }
   }

   private void id_while() {
      try {
         this.id_native().id_case();
      } catch (Exception var2) {
         id_case.warn("Failed to load operators list: ", var2);
      }
   }

   private void id_public() {
      try {
         this.id_private().id_case();
      } catch (IOException var2) {
         id_case.warn("Failed to load ip banlist: ", var2);
      }
   }

   @Override
   public boolean id_protected(GameProfile var1) {
      return this.id_native().id_class(var1);
   }

   private void id_synchronized() {
      try {
         this.id_private().id_throws();
      } catch (IOException var2) {
         id_case.warn("Failed to save ip banlist: ", var2);
      }
   }
}
