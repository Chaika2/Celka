package celestial;

import java.util.function.Function;

class DM {
   private final Do_1 break_;
   private rqO_2 byte_;

   public DM byte_(xd_3 var1) {
      rqO_2 var2 = Uh_1.super_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.this_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.byte_(var1, var2, var3));
      rqO_2 var4 = Uh_1.else_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_(var1, var4);
      return this;
   }

   public DM(DG var1, Do_1 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public DM class_(xd_3 var1, xd_3 var2) {
      rqO_2 var3 = Uh_1.abstract_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.byte_(var1, var3));
      this.class_.class_.accept(DG.byte_(var2, var3));
      this.class_.class_(var1.case_());
      this.class_.class_(var2);
      return this;
   }

   public DM class_(xd_3 var1, DD var2) {
      this.byte_ = var2.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.byte_(var1, this.byte_));
      return this;
   }

   public DM class_(Function<Do_1, rqO_2> var1) {
      this.byte_ = (rqO_2)var1.apply(this.break_);
      return this;
   }

   public DM class_(xd_3 var1) {
      rqO_2 var2 = Uh_1.native_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.volatile_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.break_(var1, var2, var3));
      rqO_2 var4 = Uh_1.final_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_(var1, var4);
      return this;
   }

   public DM break_(xd_3 var1) {
      rqO_2 var2 = Uh_1.synchronized_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.return_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var4 = Uh_1.public_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.class_(var1, var2, var3, var4));
      rqO_2 var5 = Uh_1.goto_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_(var1, var5);
      return this;
   }

   public DM throws_(xd_3 var1) {
      rqO_2 var2 = Uh_1.interface_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.char_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.throws_(var1, var2, var3));
      return this;
   }

   public DM catch_(xd_3 var1) {
      rqO_2 var2 = Uh_1.import_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.static_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var4 = Uh_1.short_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.break_(var1, var2, var3, var4));
      return this;
   }

   public DM case_(xd_3 var1) {
      if (this.byte_ == null) {
         throw new IllegalStateException("Full block not generated yet");
      } else {
         rqO_2 var2 = Uh_1.long_.class_(var1, this.break_, this.class_.break_);
         rqO_2 var3 = Uh_1.float_.class_(var1, this.break_, this.class_.break_);
         this.class_.class_.accept(DG.throws_(var1, var2, var3, this.byte_));
         return this;
      }
   }

   public DM protected_(xd_3 var1) {
      rqO_2 var2 = Uh_1.try_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var3 = Uh_1.while_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var4 = Uh_1.throw_.class_(var1, this.break_, this.class_.break_);
      rqO_2 var5 = Uh_1.instanceof_.class_(var1, this.break_, this.class_.break_);
      this.class_.class_.accept(DG.break_(var1, var2, var3, var4, var5));
      return this;
   }
}
