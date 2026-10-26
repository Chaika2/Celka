package celestial;

import java.io.IOException;
import java.util.function.Supplier;

public class rFP implements ruS_2<At_1> {
   private rRJ class_;
   private rqM_2<rYB> break_;
   private long byte_;
   private rRl_1 protected_;
   private rRl_1 throws_;
   private boolean case_;
   private boolean catch_;
   private boolean private_;

   public rqM_2<rYB> byte_() {
      return this.break_;
   }

   public rFP() {
   }

   public rFP(rRJ var1, rqM_2<rYB> var2, long var3, rRl_1 var5, rRl_1 var6, boolean var7, boolean var8, boolean var9) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.<Supplier<rRJ>>class_(rRJ.final_).get();
      this.break_ = rqM_2.class_(rVL.static_, var1.volatile_());
      this.byte_ = var1.readLong();
      this.protected_ = rRl_1.class_(var1.readUnsignedByte());
      this.throws_ = rRl_1.class_(var1.readUnsignedByte());
      this.case_ = var1.readBoolean();
      this.catch_ = var1.readBoolean();
      this.private_ = var1.readBoolean();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public rRJ break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(rRJ.final_, () -> this.class_);
      var1.class_(this.break_.class_());
      var1.writeLong(this.byte_);
      var1.writeByte(this.protected_.class_());
      var1.writeByte(this.throws_.class_());
      var1.writeBoolean(this.case_);
      var1.writeBoolean(this.catch_);
      var1.writeBoolean(this.private_);
   }

   public rRl_1 throws_() {
      return this.protected_;
   }

   public boolean catch_() {
      return this.case_;
   }

   public rRl_1 case_() {
      return this.throws_;
   }

   public boolean implements_() {
      return this.private_;
   }

   public long protected_() {
      return this.byte_;
   }

   public boolean private_() {
      return this.catch_;
   }
}
