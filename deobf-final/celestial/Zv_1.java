package celestial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Zv_1 extends vm_3 {
   private static final rgP_2 class_ = new rgn_3("structure_block.structure_name");
   private static final rgP_2 throws_ = new rgn_3("structure_block.position");
   private static final rgP_2 case_ = new rgn_3("structure_block.size");
   private static final rgP_2 catch_ = new rgn_3("structure_block.integrity");
   private static final rgP_2 private_ = new rgn_3("structure_block.custom_data");
   private static final rgP_2 implements_ = new rgn_3("structure_block.include_entities");
   private static final rgP_2 finally_ = new rgn_3("structure_block.detect_size");
   private static final rgP_2 else_ = new rgn_3("structure_block.show_air");
   private static final rgP_2 synchronized_ = new rgn_3("structure_block.show_boundingbox");
   private final ryG_2 return_;
   private rpa_3 public_ = rpa_3.NONE;
   private rqd_3 goto_ = rqd_3.NONE;
   private rCD while_ = rCD.DATA;
   private boolean try_;
   private boolean instanceof_;
   private boolean throw_;
   private Lu_1 interface_;
   private Lu_1 char_;
   private Lu_1 abstract_;
   private Lu_1 long_;
   private Lu_1 float_;
   private Lu_1 boolean_;
   private Lu_1 transient_;
   private Lu_1 for_;
   private Lu_1 double_;
   private Lu_1 switch_;
   private LF r;
   private LF P;
   private LF B;
   private LF S;
   private LF s;
   private LF E;
   private LF G;
   private LF b;
   private LF M;
   private LF O;
   private LF h;
   private LF X;
   private LF J;
   private LF x;
   private final DecimalFormat d = new DecimalFormat("0.0###");

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void char_() {
      this.s.int_ = true;
      this.E.int_ = true;
      this.G.int_ = true;
      this.b.int_ = true;
      switch (this.return_.volatile_()) {
         case NONE:
            this.s.int_ = false;
            break;
         case CLOCKWISE_180:
            this.G.int_ = false;
            break;
         case COUNTERCLOCKWISE_90:
            this.b.int_ = false;
            break;
         case CLOCKWISE_90:
            this.E.int_ = false;
      }
   }

   private float byte_(String var1) {
      try {
         return Float.valueOf(var1);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private void int_() {
      this.x.break_(cN_2.class_(this.return_.instanceof_()));
   }

   public Zv_1(ryG_2 var1) {
      super(new rgn_3(xu_3.Js.volatile_()));
      this.return_ = var1;
      this.d.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void interface_() {
      rpa_3 var1 = this.return_.native_();
      switch (var1) {
         case NONE:
            this.X.break_(new rgN_2("|"));
            break;
         case LEFT_RIGHT:
            this.X.break_(new rgN_2("< >"));
            break;
         case FRONT_BACK:
            this.X.break_(new rgN_2("^ v"));
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.finally_();
         return true;
      }
   }

   private boolean class_(ryM_2 var1) {
      rfH_2 var2 = new rfH_2(this.protected_(this.char_.private_()), this.protected_(this.abstract_.private_()), this.protected_(this.long_.private_()));
      rfH_2 var3 = new rfH_2(this.protected_(this.float_.private_()), this.protected_(this.boolean_.private_()), this.protected_(this.transient_.private_()));
      float var4 = this.byte_(this.for_.private_());
      long var5 = this.class_(this.double_.private_());
      this.volatile_
         .void_()
         .class_(
            new rZp_1(
               this.return_.char_(),
               var1,
               this.return_.package_(),
               this.interface_.private_(),
               var2,
               var3,
               this.return_.native_(),
               this.return_.volatile_(),
               this.switch_.private_(),
               this.return_.continue_(),
               this.return_.try_(),
               this.return_.instanceof_(),
               var4,
               var5
            )
         );
      return true;
   }

   private long class_(String var1) {
      try {
         return Long.valueOf(var1);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      rCD var5 = this.return_.package_();
      class_(var1, this.super_, this.extends_, this.package_ / 2, 10, 16777215);
      if (var5 != rCD.DATA) {
         break_(var1, this.super_, class_, this.package_ / 2 - 153, 30, 10526880);
         this.interface_.class_(var1, var2, var3, var4);
      }

      if (var5 == rCD.LOAD || var5 == rCD.SAVE) {
         break_(var1, this.super_, throws_, this.package_ / 2 - 153, 70, 10526880);
         this.char_.class_(var1, var2, var3, var4);
         this.abstract_.class_(var1, var2, var3, var4);
         this.long_.class_(var1, var2, var3, var4);
         break_(var1, this.super_, implements_, this.package_ / 2 + 154 - this.super_.class_(implements_), 150, 10526880);
      }

      if (var5 == rCD.SAVE) {
         break_(var1, this.super_, case_, this.package_ / 2 - 153, 110, 10526880);
         this.float_.class_(var1, var2, var3, var4);
         this.boolean_.class_(var1, var2, var3, var4);
         this.transient_.class_(var1, var2, var3, var4);
         break_(var1, this.super_, finally_, this.package_ / 2 + 154 - this.super_.class_(finally_), 110, 10526880);
         break_(var1, this.super_, else_, this.package_ / 2 + 154 - this.super_.class_(else_), 70, 10526880);
      }

      if (var5 == rCD.LOAD) {
         break_(var1, this.super_, catch_, this.package_ / 2 - 153, 110, 10526880);
         this.for_.class_(var1, var2, var3, var4);
         this.double_.class_(var1, var2, var3, var4);
         break_(var1, this.super_, synchronized_, this.package_ / 2 + 154 - this.super_.class_(synchronized_), 70, 10526880);
      }

      if (var5 == rCD.DATA) {
         break_(var1, this.super_, private_, this.package_ / 2 - 153, 110, 10526880);
         this.switch_.class_(var1, var2, var3, var4);
      }

      break_(var1, this.super_, var5.break_(), this.package_ / 2 - 153, 174, 10526880);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.interface_.private_();
      String var5 = this.char_.private_();
      String var6 = this.abstract_.private_();
      String var7 = this.long_.private_();
      String var8 = this.float_.private_();
      String var9 = this.boolean_.private_();
      String var10 = this.transient_.private_();
      String var11 = this.for_.private_();
      String var12 = this.double_.private_();
      String var13 = this.switch_.private_();
      this.break_(var1, var2, var3);
      this.interface_.class_(var4);
      this.char_.class_(var5);
      this.abstract_.class_(var6);
      this.long_.class_(var7);
      this.float_.class_(var8);
      this.boolean_.class_(var9);
      this.transient_.class_(var10);
      this.for_.class_(var11);
      this.double_.class_(var12);
      this.switch_.class_(var13);
   }

   private void finally_() {
      if (this.class_(ryM_2.UPDATE_DATA)) {
         this.volatile_.break_((vm_3)null);
      }
   }

   private void package_() {
      this.J.break_(cN_2.class_(this.return_.try_()));
   }

   private int protected_(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void private_() {
      this.interface_.catch_();
      this.char_.catch_();
      this.abstract_.catch_();
      this.long_.catch_();
      this.float_.catch_();
      this.boolean_.catch_();
      this.transient_.catch_();
      this.for_.catch_();
      this.double_.catch_();
      this.switch_.catch_();
   }

   private void abstract_() {
      this.interface_.private_(false);
      this.char_.private_(false);
      this.abstract_.private_(false);
      this.long_.private_(false);
      this.float_.private_(false);
      this.boolean_.private_(false);
      this.transient_.private_(false);
      this.for_.private_(false);
      this.double_.private_(false);
      this.switch_.private_(false);
      this.B.new_ = false;
      this.S.new_ = false;
      this.O.new_ = false;
      this.h.new_ = false;
      this.X.new_ = false;
      this.s.new_ = false;
      this.E.new_ = false;
      this.G.new_ = false;
      this.b.new_ = false;
      this.J.new_ = false;
      this.x.new_ = false;
      switch (this.return_.package_()) {
         case SAVE:
            this.interface_.private_(true);
            this.char_.private_(true);
            this.abstract_.private_(true);
            this.long_.private_(true);
            this.float_.private_(true);
            this.boolean_.private_(true);
            this.transient_.private_(true);
            this.B.new_ = true;
            this.O.new_ = true;
            this.h.new_ = true;
            this.J.new_ = true;
            break;
         case LOAD:
            this.interface_.private_(true);
            this.char_.private_(true);
            this.abstract_.private_(true);
            this.long_.private_(true);
            this.for_.private_(true);
            this.double_.private_(true);
            this.S.new_ = true;
            this.h.new_ = true;
            this.X.new_ = true;
            this.s.new_ = true;
            this.E.new_ = true;
            this.G.new_ = true;
            this.b.new_ = true;
            this.x.new_ = true;
            this.char_();
            break;
         case CORNER:
            this.interface_.private_(true);
            break;
         case DATA:
            this.switch_.private_(true);
      }

      this.M.break_(new rgn_3("structure_block.mode." + this.return_.package_().class_()));
   }

   private void final_() {
      this.h.break_(cN_2.class_(!this.return_.continue_()));
   }

   @Override
   public void volatile_() {
      this.native_();
   }

   private void native_() {
      this.return_.class_(this.public_);
      this.return_.class_(this.goto_);
      this.return_.class_(this.while_);
      this.return_.class_(this.try_);
      this.return_.protected_(this.instanceof_);
      this.return_.throws_(this.throw_);
      this.volatile_.break_((vm_3)null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.r = this.class_((LF)(new LF(this.package_ / 2 - 4 - 150, 210, 150, 20, cN_2.byte_, var1x -> this.finally_())));
      this.P = this.class_((LF)(new LF(this.package_ / 2 + 4, 210, 150, 20, cN_2.protected_, var1x -> this.native_())));
      this.B = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 185, 50, 20, new rgn_3("structure_block.button.save"), var1x -> {
         if (this.return_.package_() == rCD.SAVE) {
            this.class_(ryM_2.SAVE_AREA);
            this.volatile_.break_((vm_3)null);
         }
      })));
      this.S = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 185, 50, 20, new rgn_3("structure_block.button.load"), var1x -> {
         if (this.return_.package_() == rCD.LOAD) {
            this.class_(ryM_2.LOAD_AREA);
            this.volatile_.break_((vm_3)null);
         }
      })));
      this.M = this.class_((LF)(new LF(this.package_ / 2 - 4 - 150, 185, 50, 20, new rgN_2("MODE"), var1x -> {
         this.return_.new_();
         this.abstract_();
      })));
      this.O = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 120, 50, 20, new rgn_3("structure_block.button.detect_size"), var1x -> {
         if (this.return_.package_() == rCD.SAVE) {
            this.class_(ryM_2.SCAN_AREA);
            this.volatile_.break_((vm_3)null);
         }
      })));
      this.h = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 160, 50, 20, new rgN_2("ENTITIES"), var1x -> {
         this.return_.class_(!this.return_.continue_());
         this.final_();
      })));
      this.X = this.class_((LF)(new LF(this.package_ / 2 - 20, 185, 40, 20, new rgN_2("MIRROR"), var1x -> {
         switch (this.return_.native_()) {
            case NONE:
               this.return_.class_(rpa_3.LEFT_RIGHT);
               break;
            case LEFT_RIGHT:
               this.return_.class_(rpa_3.FRONT_BACK);
               break;
            case FRONT_BACK:
               this.return_.class_(rpa_3.NONE);
         }

         this.interface_();
      })));
      this.J = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 80, 50, 20, new rgN_2("SHOWAIR"), var1x -> {
         this.return_.protected_(!this.return_.try_());
         this.package_();
      })));
      this.x = this.class_((LF)(new LF(this.package_ / 2 + 4 + 100, 80, 50, 20, new rgN_2("SHOWBB"), var1x -> {
         this.return_.throws_(!this.return_.instanceof_());
         this.int_();
      })));
      this.s = this.class_((LF)(new LF(this.package_ / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new rgN_2("0"), var1x -> {
         this.return_.class_(rqd_3.NONE);
         this.char_();
      })));
      this.E = this.class_((LF)(new LF(this.package_ / 2 - 1 - 40 - 20, 185, 40, 20, new rgN_2("90"), var1x -> {
         this.return_.class_(rqd_3.CLOCKWISE_90);
         this.char_();
      })));
      this.G = this.class_((LF)(new LF(this.package_ / 2 + 1 + 20, 185, 40, 20, new rgN_2("180"), var1x -> {
         this.return_.class_(rqd_3.CLOCKWISE_180);
         this.char_();
      })));
      this.b = this.class_((LF)(new LF(this.package_ / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new rgN_2("270"), var1x -> {
         this.return_.class_(rqd_3.COUNTERCLOCKWISE_90);
         this.char_();
      })));
      this.interface_ = new ZF(this, this.super_, this.package_ / 2 - 152, 40, 300, 20, new rgn_3("structure_block.structure_name"));
      this.interface_.implements_(64);
      this.interface_.class_(this.return_.throws_());
      this.native_.add(this.interface_);
      rfH_2 var1 = this.return_.finally_();
      this.char_ = new Lu_1(this.super_, this.package_ / 2 - 152, 80, 80, 20, new rgn_3("structure_block.position.x"));
      this.char_.implements_(15);
      this.char_.class_(Integer.toString(var1.b_()));
      this.native_.add(this.char_);
      this.abstract_ = new Lu_1(this.super_, this.package_ / 2 - 72, 80, 80, 20, new rgn_3("structure_block.position.y"));
      this.abstract_.implements_(15);
      this.abstract_.class_(Integer.toString(var1.c_()));
      this.native_.add(this.abstract_);
      this.long_ = new Lu_1(this.super_, this.package_ / 2 + 8, 80, 80, 20, new rgn_3("structure_block.position.z"));
      this.long_.implements_(15);
      this.long_.class_(Integer.toString(var1.d_()));
      this.native_.add(this.long_);
      rfH_2 var2 = this.return_.extends_();
      this.float_ = new Lu_1(this.super_, this.package_ / 2 - 152, 120, 80, 20, new rgn_3("structure_block.size.x"));
      this.float_.implements_(15);
      this.float_.class_(Integer.toString(var2.b_()));
      this.native_.add(this.float_);
      this.boolean_ = new Lu_1(this.super_, this.package_ / 2 - 72, 120, 80, 20, new rgn_3("structure_block.size.y"));
      this.boolean_.implements_(15);
      this.boolean_.class_(Integer.toString(var2.c_()));
      this.native_.add(this.boolean_);
      this.transient_ = new Lu_1(this.super_, this.package_ / 2 + 8, 120, 80, 20, new rgn_3("structure_block.size.z"));
      this.transient_.implements_(15);
      this.transient_.class_(Integer.toString(var2.d_()));
      this.native_.add(this.transient_);
      this.for_ = new Lu_1(this.super_, this.package_ / 2 - 152, 120, 80, 20, new rgn_3("structure_block.integrity.integrity"));
      this.for_.implements_(15);
      this.for_.class_(this.d.format((double)this.return_.super_()));
      this.native_.add(this.for_);
      this.double_ = new Lu_1(this.super_, this.package_ / 2 - 72, 120, 80, 20, new rgn_3("structure_block.integrity.seed"));
      this.double_.implements_(31);
      this.double_.class_(Long.toString(this.return_.this_()));
      this.native_.add(this.double_);
      this.switch_ = new Lu_1(this.super_, this.package_ / 2 - 152, 120, 240, 20, new rgn_3("structure_block.custom_data"));
      this.switch_.implements_(128);
      this.switch_.class_(this.return_.final_());
      this.native_.add(this.switch_);
      this.public_ = this.return_.native_();
      this.interface_();
      this.goto_ = this.return_.volatile_();
      this.char_();
      this.while_ = this.return_.package_();
      this.abstract_();
      this.try_ = this.return_.continue_();
      this.final_();
      this.instanceof_ = this.return_.try_();
      this.package_();
      this.throw_ = this.return_.instanceof_();
      this.int_();
      this.break_(this.interface_);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
