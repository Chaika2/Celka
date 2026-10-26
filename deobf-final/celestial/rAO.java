package celestial;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nonnull;

public final class rAO extends vk_3 {
   private static final rgP_2 implements_ = new rgN_2("A-Z");
   private static final rgP_2 finally_ = new rgN_2("Z-A");
   private static final rgP_2 else_ = new rgn_3("refresh");
   private final rAw_1 synchronized_ = new rAw_1(this::native_);
   private Comparator<Ar_1> return_;
   private Li_1 public_;
   private rAM goto_;
   private Lu_1 while_;

   public rAO(vk_3 var1) {
      super(var1.throws_, var1.class_.class_, var1.class_.byte_, var1.private_, var1.new_());
      vh_3 var2 = var1.class_;
      Runnable var3 = var2.break_;
      var2.break_ = () -> {
         var3.run();
         this.native_();
      };
   }

   @Override
   public void class_(@Nonnull Li_1 var1, @Nonnull Stream<vd_3> var2) {
      super.class_(var1, var2);
      if (this.public_ != null) {
         this.native_();
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.protected_(0);
      this.catch_.class_(var1, var2, var3, var4);
      this.goto_.class_(var1, var2, var3, var4);
      this.while_.class_(var1, var2, var3, var4);

      for (LZ var6 : this.new_) {
         var6.class_(var1, var2, var3, var4);
      }

      class_(var1, this.super_, this.extends_, this.package_ / 2, 16, 16777215);
   }

   private Optional<LZ> break_(rgP_2 var1) {
      return this.new_.stream().filter(var1x -> var1.equals(var1x.C_())).findFirst();
   }

   @Override
   public void private_() {
      super.private_();
      this.while_.catch_();
   }

   private void native_() {
      this.synchronized_.class_(this.public_.x_(), this.goto_.x_());
      this.goto_.class_(this.goto_.package_());
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      super.v_();
      rgn_3 var1 = new rgn_3("gui.done");
      rgn_3 var2 = new rgn_3("pack.openFolder");
      this.break_(var2).ifPresent(var1x -> {
         var1x.volatile_ = this.package_ / 2 + 25;
         var1x.final_ = this.int_ - 48;
      });
      this.break_(var1).ifPresent(var1x -> {
         var1x.volatile_ = this.package_ / 2 + 25;
         var1x.final_ = this.int_ - 26;
      });
      this.class_((LF)(new LF(this.package_ / 2 - 204, this.int_ - 26, 30, 20, implements_, var1x -> this.synchronized_.class_(this.return_ = rAw_1.class_))));
      this.class_((LF)(new LF(this.package_ / 2 - 204 + 34, this.int_ - 26, 30, 20, finally_, var1x -> this.synchronized_.class_(this.return_ = rAw_1.break_))));
      this.class_((LF)(new LF(this.package_ / 2 - 63, this.int_ - 26, 60, 20, else_, var1x -> {
         this.volatile_();
         this.volatile_.break_(this);
         this.finally_();
         this.goto_.class_(this.public_);
         this.native_();
         this.goto_.class_(0.0);
      })));
      (this.while_ = new Lu_1(this.super_, this.package_ / 2 - 203, this.int_ - 46, 198, 16, this.while_, rgN_2.byte_, true))
         .class_(new rgn_3("options.resourcepack.search"))
         .catch_(true);
      this.while_.class_(this.synchronized_::class_);
      this.native_.add(this.while_);
      this.public_ = this.case_;
      this.native_.remove(this.public_);
      this.native_.add(this.goto_ = new rAM(this.public_));
      this.synchronized_.class_();
      this.synchronized_.class_(this.return_ == null ? (this.return_ = rAw_1.class_) : this.return_);
      this.synchronized_.class_(this.while_.private_());
      this.synchronized_.break_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
