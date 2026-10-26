package celestial;

import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import java.util.UUID;

public class rys_3 extends ryO_2 implements rHf_1 {
   private static rCB id_class;
   private static MinecraftSessionService id_break;
   private GameProfile id_byte;
   private int id_protected;
   private boolean id_throws;

   public rys_3() {
      super(ryW_2.id_package);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      if (var2.id_byte("SkullOwner", 10)) {
         this.id_class(rco_3.id_class(var2.id_int("SkullOwner")));
      } else if (var2.id_byte("ExtraType", 8)) {
         String var3 = var2.id_native("ExtraType");
         if (!rql_3.id_break(var3)) {
            this.id_class(new GameProfile((UUID)null, var3));
         }
      }
   }

   public float id_class(float var1) {
      return this.id_throws ? (float)this.id_protected + var1 : (float)this.id_protected;
   }

   public void id_class(GameProfile var1) {
      this.id_byte = var1;
      this.id_private();
   }

   public static void id_class(MinecraftSessionService var0) {
      id_break = var0;
   }

   public static void id_class(rCB var0) {
      id_class = var0;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_byte != null) {
         rcd_3 var2 = new rcd_3();
         rco_3.id_class(var2, this.id_byte);
         var1.id_class("SkullOwner", var2);
      }

      return var1;
   }

   public static GameProfile id_break(GameProfile var0) {
      if (var0 != null && !rql_3.id_break(var0.getName())) {
         if (var0.isComplete() && var0.getProperties().containsKey("textures")) {
            return var0;
         } else if (id_class != null && id_break != null) {
            GameProfile var1 = id_class.id_class(var0.getName());
            if (var1 == null) {
               return var0;
            } else {
               Property var2 = (Property)Iterables.getFirst(var1.getProperties().get("textures"), (Property)null);
               if (var2 == null) {
                  var1 = id_break.fillProfileProperties(var1, true);
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
   public void id_throws() {
      xc_3 var1 = this.id_abstract();
      if (var1.id_class(xu_3.sQ) || var1.id_class(xu_3.sN)) {
         if (this.id_extends.id_public(this.id_native)) {
            this.id_throws = true;
            this.id_protected++;
         } else {
            this.id_throws = false;
         }
      }
   }

   public GameProfile id_catch() {
      return this.id_byte;
   }

   private void id_private() {
      this.id_byte = id_break(this.id_byte);
      this.id_break();
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 4, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
