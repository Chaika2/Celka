package celestial;

public class fe_3 extends jW_2<rHJ> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1[] byte_ = new Iq_1[4];

   public fe_3(jz_3 var1) {
      super(var1);
      this.class_ = new Iq_1(64, 64, 0, 0);
      this.class_.class_(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.break_ = new Iq_1(64, 64, 0, 22);
      this.break_.class_(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.byte_[0] = new Iq_1(64, 64, 50, 0);
      this.byte_[1] = new Iq_1(64, 64, 50, 6);
      this.byte_[2] = new Iq_1(64, 64, 50, 12);
      this.byte_[3] = new Iq_1(64, 64, 50, 18);
      this.byte_[0].class_(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.byte_[1].class_(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.byte_[2].class_(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.byte_[3].class_(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.byte_[0].case_ = (float) (Math.PI / 2);
      this.byte_[1].case_ = (float) (Math.PI / 2);
      this.byte_[2].case_ = (float) (Math.PI / 2);
      this.byte_[3].case_ = (float) (Math.PI / 2);
      this.byte_[0].private_ = 0.0F;
      this.byte_[1].private_ = (float) (Math.PI / 2);
      this.byte_[2].private_ = (float) (Math.PI * 3.0 / 2.0);
      this.byte_[3].private_ = (float) Math.PI;
   }

   private void class_(Ml_1 var1, Hx_1 var2, boolean var3, rpr_3 var4, Ig_1 var5, int var6, int var7, boolean var8) {
      this.class_.finally_ = var3;
      this.break_.finally_ = !var3;
      this.byte_[0].finally_ = !var3;
      this.byte_[1].finally_ = var3;
      this.byte_[2].finally_ = !var3;
      this.byte_[3].finally_ = var3;
      var1.class_();
      var1.class_(0.0, 0.5625, var8 ? -1.0 : 0.0);
      var1.class_(rje_3.break_.byte_(90.0F));
      var1.class_(0.5, 0.5, 0.5);
      var1.class_(rje_3.case_.byte_(180.0F + var4.package_()));
      var1.class_(-0.5, -0.5, -0.5);
      Ok_1 var9 = var5.class_(var2, HU::break_);
      this.class_.class_(var1, var9, var6, var7);
      this.break_.class_(var1, var9, var6, var7);
      this.byte_[0].class_(var1, var9, var6, var7);
      this.byte_[1].class_(var1, var9, var6, var7);
      this.byte_[2].class_(var1, var9, var6, var7);
      this.byte_[3].class_(var1, var9, var6, var7);
      var1.break_();
   }

   public void class_(rHJ var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      Ig_1 var7 = lp_3.finally_[var1.class_().break_()];
      rYB var8 = var1.while_();
      if (var8 != null) {
         xc_3 var9 = var1.abstract_();
         ryJ_2 var10 = ryh_3.class_(ryW_2.public_, xb_3::implements_, xb_3::private_, xt_3.final_, var9, var8, var1.char_(), (var0, var1x) -> false);
         int var11 = var10.apply(new jB_2()).get(var5);
         this.class_(var3, var4, var9.byte_(xb_3.volatile_) == rCp_1.HEAD, var9.byte_(xb_3.p), var7, var11, var6, false);
      } else {
         this.class_(var3, var4, true, rpr_3.SOUTH, var7, var5, var6, false);
         this.class_(var3, var4, false, rpr_3.SOUTH, var7, var5, var6, true);
      }
   }
}
