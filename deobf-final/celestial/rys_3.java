package celestial;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class rys_3 extends ryO_2 implements rHf_1 {
   private static rCB class_;
   private static MinecraftSessionService break_;
   private GameProfile byte_;
   private int protected_;
   private boolean throws_;

   public rys_3() {
      super(ryW_2.package_);
   }

   @Override
   public void class_(xc_3 var1, rcd_3 var2) {
      super.class_(var1, var2);
      if (var2.byte_("SkullOwner", 10)) {
         this.class_(rco_3.class_(var2.int_("SkullOwner")));
      } else if (var2.byte_("ExtraType", 8)) {
         String var3 = var2.native_("ExtraType");
         if (!rql_3.break_(var3)) {
            this.class_(new GameProfile((UUID)null, var3));
         }
      }
   }

   public float class_(float var1) {
      return this.throws_ ? (float)this.protected_ + var1 : (float)this.protected_;
   }

   public void class_(GameProfile var1) {
      this.byte_ = var1;
      this.private_();
   }

   public static void class_(MinecraftSessionService var0) {
      break_ = var0;
   }

   public static void class_(rCB var0) {
      class_ = var0;
   }

   @Override
   public rcd_3 class_(rcd_3 var1) {
      super.class_(var1);
      if (this.byte_ != null) {
         rcd_3 var2 = new rcd_3();
         rco_3.class_(var2, this.byte_);
         var1.class_("SkullOwner", var2);
      }

      return var1;
   }

   public static GameProfile break_(GameProfile var0) {
      if (var0 != null && !rql_3.break_(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if (class_ != null && break_ != null) {
            GameProfile var1 = class_.class_(var0.getName());
            if (var1 == null) {
               return var0;
            } else {
               Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
               if (var2 == null) {
                  var1 = break_.fillProfileProperties(var1, true);
               }

               return var1;
            }
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   @Override
   public void throws_() {
      xc_3 var1 = this.abstract_();
      if (var1.class_(xu_3.sQ) || var1.class_(xu_3.sN)) {
         if (this.extends_.public_(this.native_)) {
            this.throws_ = true;
            this.protected_++;
         } else {
            this.throws_ = false;
         }
      }
   }

   public GameProfile catch_() {
      return this.byte_;
   }

   private void private_() {
      this.byte_ = break_(this.byte_);
      this.break_();
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.native_, 4, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.class_(new rcd_3());
   }
}
