package celestial;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnZ_2 extends rCr_1 {
   private static final Logger case_ = LogManager.getLogger();

   @Override
   public boolean byte_(GameProfile var1) {
      return !this.int_() || this.case_(var1) || this.finally_().class_(var1);
   }

   public rnZ_2(rnv_3 var1, rVv_1 var2, rrGx_1 var3) {
      super(var1, var2, var3, var1.class_().import_);
      rnp_3 var4 = var1.class_();
      this.class_(var4.static_);
      super.class_((Boolean)var4.P.get());
      this.goto_();
      this.return_();
      this.public_();
      this.synchronized_();
      this.while_();
      this.instanceof_();
      this.try_();
      if (!this.finally_().break_().exists()) {
         this.throw_();
      }
   }

   @Override
   public void class_(GameProfile var1) {
      super.class_(var1);
      this.try_();
   }

   @Override
   public void class_(boolean var1) {
      super.class_(var1);
      this.break_().finally_(var1);
   }

   @Override
   public void class_() {
      this.instanceof_();
   }

   public rnv_3 break_() {
      return (rnv_3)super.byte_();
   }

   @Override
   public void break_(GameProfile var1) {
      super.break_(var1);
      this.try_();
   }

   private void goto_() {
      try {
         this.catch_().case_();
      } catch (IOException var2) {
         case_.warn("Failed to load user banlist: ", var2);
      }
   }

   private void instanceof_() {
      try {
         this.finally_().case_();
      } catch (Exception var2) {
         case_.warn("Failed to load white-list: ", var2);
      }
   }

   private void return_() {
      try {
         this.catch_().throws_();
      } catch (IOException var2) {
         case_.warn("Failed to save user banlist: ", var2);
      }
   }

   private void throw_() {
      try {
         this.finally_().throws_();
      } catch (Exception var2) {
         case_.warn("Failed to save white-list: ", var2);
      }
   }

   private void try_() {
      try {
         this.native_().throws_();
      } catch (Exception var2) {
         case_.warn("Failed to save operators list: ", var2);
      }
   }

   private void while_() {
      try {
         this.native_().case_();
      } catch (Exception var2) {
         case_.warn("Failed to load operators list: ", var2);
      }
   }

   private void public_() {
      try {
         this.private_().case_();
      } catch (IOException var2) {
         case_.warn("Failed to load ip banlist: ", var2);
      }
   }

   @Override
   public boolean protected_(GameProfile var1) {
      return this.native_().class_(var1);
   }

   private void synchronized_() {
      try {
         this.private_().throws_();
      } catch (IOException var2) {
         case_.warn("Failed to save ip banlist: ", var2);
      }
   }
}
