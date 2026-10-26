package celestial;

import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Set;
import java.util.function.Supplier;

public class rvZ_2 implements ruS_2<At_1> {
   private int class_;
   private long break_;
   private boolean byte_;
   private rRl_1 protected_;
   private rRl_1 throws_;
   private Set<rqM_2<rYB>> case_;
   private rVv_1 catch_;
   private rRJ private_;
   private rqM_2<rYB> implements_;
   private int finally_;
   private int extends_;
   private boolean native_;
   private boolean volatile_;
   private boolean final_;
   private boolean package_;

   public long byte_() {
      return this.break_;
   }

   public rvZ_2() {
   }

   public rvZ_2(
      int var1,
      rRl_1 var2,
      rRl_1 var3,
      long var4,
      boolean var6,
      Set<rqM_2<rYB>> var7,
      rVv_1 var8,
      rRJ var9,
      rqM_2<rYB> var10,
      int var11,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16
   ) {
      this.class_ = var1;
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
      this.implements_ = var10;
      this.break_ = var4;
      this.protected_ = var2;
      this.throws_ = var3;
      this.finally_ = var11;
      this.byte_ = var6;
      this.extends_ = var12;
      this.native_ = var13;
      this.volatile_ = var14;
      this.final_ = var15;
      this.package_ = var16;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readInt();
      this.byte_ = var1.readBoolean();
      this.protected_ = rRl_1.class_(var1.readByte());
      this.throws_ = rRl_1.class_(var1.readByte());
      int var2 = var1.case_();
      this.case_ = Sets.newHashSet();

      for (int var3 = 0; var3 < var2; var3++) {
         this.case_.add(rqM_2.class_(rVL.static_, var1.volatile_()));
      }

      this.catch_ = var1.class_(rVv_1.class_);
      this.private_ = var1.<Supplier<rRJ>>class_(rRJ.final_).get();
      this.implements_ = rqM_2.class_(rVL.static_, var1.volatile_());
      this.break_ = var1.readLong();
      this.finally_ = var1.case_();
      this.extends_ = var1.case_();
      this.native_ = var1.readBoolean();
      this.volatile_ = var1.readBoolean();
      this.final_ = var1.readBoolean();
      this.package_ = var1.readBoolean();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeInt(this.class_);
      var1.writeBoolean(this.byte_);
      var1.writeByte(this.protected_.class_());
      var1.writeByte(this.throws_.class_());
      var1.protected_(this.case_.size());

      for (rqM_2 var3 : this.case_) {
         var1.class_(var3.class_());
      }

      var1.class_(rVv_1.class_, this.catch_);
      var1.class_(rRJ.final_, () -> this.private_);
      var1.class_(this.implements_.class_());
      var1.writeLong(this.break_);
      var1.protected_(this.finally_);
      var1.protected_(this.extends_);
      var1.writeBoolean(this.native_);
      var1.writeBoolean(this.volatile_);
      var1.writeBoolean(this.final_);
      var1.writeBoolean(this.package_);
   }

   public int break_() {
      return this.class_;
   }

   public rRl_1 throws_() {
      return this.protected_;
   }

   public rqM_2<rYB> finally_() {
      return this.implements_;
   }

   public Set<rqM_2<rYB>> catch_() {
      return this.case_;
   }

   public int extends_() {
      return this.extends_;
   }

   public rRl_1 case_() {
      return this.throws_;
   }

   public rRJ implements_() {
      return this.private_;
   }

   public boolean package_() {
      return this.package_;
   }

   public boolean protected_() {
      return this.byte_;
   }

   public rVm_1 private_() {
      return this.catch_;
   }

   public boolean final_() {
      return this.final_;
   }

   public boolean volatile_() {
      return this.volatile_;
   }

   public boolean native_() {
      return this.native_;
   }
}
