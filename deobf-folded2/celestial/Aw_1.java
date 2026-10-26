package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

public class Aw_1 {
   private final GameProfile id_break;
   private final Map<Type, rqO_2> id_byte = Maps.newEnumMap(Type.class);
   private rRl_1 id_protected;
   private int id_throws;
   private boolean id_case;
   private String id_catch;
   private rgP_2 id_private;
   private int id_implements;
   private int id_finally;
   private long id_extends;
   private long id_native;
   private long id_volatile;
   private boolean id_final;
   public long id_class;

   public int id_byte() {
      return this.id_throws;
   }

   public void id_byte(int var1) {
      this.id_finally = var1;
   }

   public void id_byte(long var1) {
      this.id_volatile = var1;
   }

   public long id_int() {
      return this.id_extends;
   }

   public Aw_1(rvo_3 var1) {
      this.id_break = var1.id_class();
      this.id_protected = var1.id_byte();
      this.id_throws = var1.id_break();
      this.id_private = var1.id_protected();
      if (!this.id_break.getId().equals(rhd_3.id_extends(this.id_break.getName()))) {
         this.id_final = true;
      }

      this.id_class = System.currentTimeMillis();
   }

   public Aw_1(GameProfile var1) {
      this.id_break = var1;
   }

   @Override
   public String toString() {
      return "NetworkPlayerInfo{gameProfile="
         + this.id_break
         + ", playerTextures="
         + this.id_byte
         + ", gameType="
         + this.id_protected
         + ", responseTime="
         + this.id_throws
         + ", playerTexturesLoaded="
         + this.id_case
         + ", skinType='"
         + this.id_catch
         + "', displayName="
         + this.id_private
         + ", lastHealth="
         + this.id_implements
         + ", displayHealth="
         + this.id_finally
         + ", lastHealthTime="
         + this.id_extends
         + ", healthBlinkTime="
         + this.id_native
         + ", renderVisibilityId="
         + this.id_volatile
         + "}";
   }

   public void id_class(rgP_2 var1) {
      this.id_private = var1;
   }

   public void id_class(long var1) {
      this.id_extends = var1;
   }

   public void id_class(boolean var1) {
      this.id_final = var1;
   }

   protected void id_class(int var1) {
      this.id_throws = var1;
   }

   protected void id_class(rRl_1 var1) {
      this.id_protected = var1;
   }

   public GameProfile id_class() {
      return this.id_break;
   }

   public void id_break(int var1) {
      this.id_implements = var1;
   }

   public void id_break(long var1) {
      this.id_native = var1;
   }

   public rRl_1 id_break() {
      return this.id_protected;
   }

   public String id_throws() {
      return this.id_catch == null ? jH_2.id_break(this.id_break.getId()) : this.id_catch;
   }

   public rgP_2 id_finally() {
      return uR_2.id_byte(this);
   }

   public rqO_2 id_catch() {
      this.id_native();
      return this.id_byte.get(Type.CAPE);
   }

   public String id_extends() {
      return this.id_finally().id_byte().trim();
   }

   public rqO_2 id_case() {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super()) {
         return jH_2.id_class(this.id_break.getId());
      } else {
         this.id_native();
         return (rqO_2)MoreObjects.firstNonNull(this.id_byte.get(Type.SKIN), jH_2.id_class(this.id_break.getId()));
      }
   }

   public long id_continue() {
      return this.id_volatile;
   }

   public rnB_2 id_implements() {
      gm_3 var1 = (gm_3)QY.id_instanceof().id_class[56];
      return var1 == null ? null : var1.id_package().id_private(this.id_class().getName());
   }

   public long id_new() {
      return this.id_native;
   }

   public int id_package() {
      return this.id_finally;
   }

   public boolean id_super() {
      return this.id_final;
   }

   public void id_protected(long var1) {
      this.id_class = var1;
   }

   public boolean id_protected() {
      return this.id_case() != null;
   }

   public rqO_2 id_private() {
      this.id_native();
      return this.id_byte.get(Type.ELYTRA);
   }

   public int id_final() {
      return this.id_implements;
   }

   public rgP_2 id_volatile() {
      return this.id_private;
   }

   protected void id_native() {
      synchronized (this) {
         if (!this.id_case) {
            this.id_case = true;
            QY.id_instanceof().id_throws().id_class(this.id_break, (var1, var2, var3) -> {
               this.id_byte.put(var1, var2);
               if (var1 == Type.SKIN) {
                  this.id_catch = var3.getMetadata("model");
                  if (this.id_catch == null) {
                     this.id_catch = "default";
                  }
               }
            }, true);
         }
      }
   }
}
