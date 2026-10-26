package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;

public class Aw_1 {
   private final GameProfile break_;
   private final Map<Type, rqO_2> byte_ = Maps.newEnumMap(Type.class);
   private rRl_1 protected_;
   private int throws_;
   private boolean case_;
   private String catch_;
   private rgP_2 private_;
   private int implements_;
   private int finally_;
   private long extends_;
   private long native_;
   private long volatile_;
   private boolean final_;
   public long class_;

   public int byte_() {
      return this.throws_;
   }

   public void byte_(int var1) {
      this.finally_ = var1;
   }

   public void byte_(long var1) {
      this.volatile_ = var1;
   }

   public long int_() {
      return this.extends_;
   }

   public Aw_1(rvo_3 var1) {
      this.break_ = var1.class_();
      this.protected_ = var1.byte_();
      this.throws_ = var1.break_();
      this.private_ = var1.protected_();
      if (!this.break_.getId().equals(rhd_3.extends_(this.break_.getName()))) {
         this.final_ = true;
      }

      this.class_ = System.currentTimeMillis();
   }

   public Aw_1(GameProfile var1) {
      this.break_ = var1;
   }

   @Override
   public String toString() {
      return "NetworkPlayerInfo{gameProfile="
         + this.break_
         + ", playerTextures="
         + this.byte_
         + ", gameType="
         + this.protected_
         + ", responseTime="
         + this.throws_
         + ", playerTexturesLoaded="
         + this.case_
         + ", skinType='"
         + this.catch_
         + "', displayName="
         + this.private_
         + ", lastHealth="
         + this.implements_
         + ", displayHealth="
         + this.finally_
         + ", lastHealthTime="
         + this.extends_
         + ", healthBlinkTime="
         + this.native_
         + ", renderVisibilityId="
         + this.volatile_
         + "}";
   }

   public void class_(rgP_2 var1) {
      this.private_ = var1;
   }

   public void class_(long var1) {
      this.extends_ = var1;
   }

   public void class_(boolean var1) {
      this.final_ = var1;
   }

   protected void class_(int var1) {
      this.throws_ = var1;
   }

   protected void class_(rRl_1 var1) {
      this.protected_ = var1;
   }

   public GameProfile class_() {
      return this.break_;
   }

   public void break_(int var1) {
      this.implements_ = var1;
   }

   public void break_(long var1) {
      this.native_ = var1;
   }

   public rRl_1 break_() {
      return this.protected_;
   }

   public String throws_() {
      return this.catch_ == null ? jH_2.break_(this.break_.getId()) : this.catch_;
   }

   public rgP_2 finally_() {
      return uR_2.byte_(this);
   }

   public rqO_2 catch_() {
      this.native_();
      return this.byte_.get(Type.CAPE);
   }

   public String extends_() {
      return this.finally_().byte_().trim();
   }

   public rqO_2 case_() {
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_().super_()) {
         return jH_2.class_(this.break_.getId());
      } else {
         this.native_();
         return (rqO_2)MoreObjects.firstNonNull(this.byte_.get(Type.SKIN), jH_2.class_(this.break_.getId()));
      }
   }

   public long continue_() {
      return this.volatile_;
   }

   public rnB_2 implements_() {
      gm_3 var1 = (gm_3)QY.instanceof_().class_[56];
      return var1 == null ? null : var1.package_().private_(this.class_().getName());
   }

   public long new_() {
      return this.native_;
   }

   public int package_() {
      return this.finally_;
   }

   public boolean super_() {
      return this.final_;
   }

   public void protected_(long var1) {
      this.class_ = var1;
   }

   public boolean protected_() {
      return this.case_() != null;
   }

   public rqO_2 private_() {
      this.native_();
      return this.byte_.get(Type.ELYTRA);
   }

   public int final_() {
      return this.implements_;
   }

   public rgP_2 volatile_() {
      return this.private_;
   }

   protected void native_() {
      synchronized (this) {
         if (!this.case_) {
            this.case_ = true;
            QY.instanceof_().throws_().class_(this.break_, (var1, var2, var3) -> {
               this.byte_.put(var1, var2);
               if (var1 == Type.SKIN) {
                  this.catch_ = var3.getMetadata("model");
                  if (this.catch_ == null) {
                     this.catch_ = "default";
                  }
               }
            }, true);
         }
      }
   }
}
