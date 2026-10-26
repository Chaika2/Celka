package celestial;

import java.io.IOException;

public class rZp_1 implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private ryM_2 break_;
   private rCD byte_;
   private String protected_;
   private rfH_2 throws_;
   private rfH_2 case_;
   private rpa_3 catch_;
   private rqd_3 private_;
   private String implements_;
   private boolean finally_;
   private boolean extends_;
   private boolean native_;
   private float volatile_;
   private long final_;

   public ryM_2 byte_() {
      return this.break_;
   }

   public rZp_1() {
   }

   public rZp_1(
      rfH_2 var1,
      ryM_2 var2,
      rCD var3,
      String var4,
      rfH_2 var5,
      rfH_2 var6,
      rpa_3 var7,
      rqd_3 var8,
      String var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      long var14
   ) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = var11;
      this.native_ = var12;
      this.volatile_ = var13;
      this.final_ = var14;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.class_(ryM_2.class);
      this.byte_ = var1.class_(rCD.class);
      this.protected_ = var1.throws_(32767);
      byte var2 = 48;
      this.throws_ = new rfH_2(rfU_2.class_(var1.readByte(), -48, 48), rfU_2.class_(var1.readByte(), -48, 48), rfU_2.class_(var1.readByte(), -48, 48));
      byte var3 = 48;
      this.case_ = new rfH_2(rfU_2.class_(var1.readByte(), 0, 48), rfU_2.class_(var1.readByte(), 0, 48), rfU_2.class_(var1.readByte(), 0, 48));
      this.catch_ = var1.class_(rpa_3.class);
      this.private_ = var1.class_(rqd_3.class);
      this.implements_ = var1.throws_(12);
      this.volatile_ = rfU_2.class_(var1.readFloat(), 0.0F, 1.0F);
      this.final_ = var1.catch_();
      byte var4 = var1.readByte();
      this.finally_ = (var4 & 1) != 0;
      this.extends_ = (var4 & 2) != 0;
      this.native_ = (var4 & 4) != 0;
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.byte_);
      var1.class_(this.protected_);
      var1.writeByte(this.throws_.b_());
      var1.writeByte(this.throws_.c_());
      var1.writeByte(this.throws_.d_());
      var1.writeByte(this.case_.b_());
      var1.writeByte(this.case_.c_());
      var1.writeByte(this.case_.d_());
      var1.class_(this.catch_);
      var1.class_(this.private_);
      var1.class_(this.implements_);
      var1.writeFloat(this.volatile_);
      var1.class_(this.final_);
      byte var2 = 0;
      if (this.finally_) {
         var2 |= 1;
      }

      if (this.extends_) {
         var2 |= 2;
      }

      if (this.native_) {
         var2 |= 4;
      }

      var1.writeByte(var2);
   }

   public String throws_() {
      return this.protected_;
   }

   public String finally_() {
      return this.implements_;
   }

   public rfH_2 catch_() {
      return this.case_;
   }

   public boolean extends_() {
      return this.finally_;
   }

   public rfH_2 case_() {
      return this.throws_;
   }

   public rqd_3 implements_() {
      return this.private_;
   }

   public long package_() {
      return this.final_;
   }

   public rCD protected_() {
      return this.byte_;
   }

   public rpa_3 private_() {
      return this.catch_;
   }

   public float final_() {
      return this.volatile_;
   }

   public boolean volatile_() {
      return this.native_;
   }

   public boolean native_() {
      return this.extends_;
   }
}
