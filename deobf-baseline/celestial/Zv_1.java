package celestial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Zv_1 extends vm_3 {
   private static final rgP_2 id_class = new rgn_3("structure_block.structure_name");
   private static final rgP_2 id_throws = new rgn_3("structure_block.position");
   private static final rgP_2 id_case = new rgn_3("structure_block.size");
   private static final rgP_2 id_catch = new rgn_3("structure_block.integrity");
   private static final rgP_2 id_private = new rgn_3("structure_block.custom_data");
   private static final rgP_2 id_implements = new rgn_3("structure_block.include_entities");
   private static final rgP_2 id_finally = new rgn_3("structure_block.detect_size");
   private static final rgP_2 id_else = new rgn_3("structure_block.show_air");
   private static final rgP_2 id_synchronized = new rgn_3("structure_block.show_boundingbox");
   private final ryG_2 id_return;
   private rpa_3 id_public = rpa_3.NONE;
   private rqd_3 id_goto = rqd_3.NONE;
   private rCD id_while = rCD.DATA;
   private boolean id_try;
   private boolean id_instanceof;
   private boolean id_throw;
   private Lu_1 id_interface;
   private Lu_1 id_char;
   private Lu_1 id_abstract;
   private Lu_1 id_long;
   private Lu_1 id_float;
   private Lu_1 id_boolean;
   private Lu_1 id_transient;
   private Lu_1 id_for;
   private Lu_1 id_double;
   private Lu_1 id_switch;
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
   private void id_char() {
      this.s.id_int = true;
      this.E.id_int = true;
      this.G.id_int = true;
      this.b.id_int = true;
      switch (this.id_return.id_volatile()) {
         case NONE:
            this.s.id_int = false;
            break;
         case CLOCKWISE_180:
            this.G.id_int = false;
            break;
         case COUNTERCLOCKWISE_90:
            this.b.id_int = false;
            break;
         case CLOCKWISE_90:
            this.E.id_int = false;
      }
   }

   private float id_byte(String var1) {
      try {
         return Float.valueOf(var1);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private void id_int() {
      this.x.id_break(cN_2.id_class(this.id_return.id_instanceof()));
   }

   public Zv_1(ryG_2 var1) {
      super(new rgn_3(xu_3.Js.id_volatile()));
      this.id_return = var1;
      this.d.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void id_interface() {
      rpa_3 var1 = this.id_return.id_native();
      switch (var1) {
         case NONE:
            this.X.id_break(new rgN_2("|"));
            break;
         case LEFT_RIGHT:
            this.X.id_break(new rgN_2("< >"));
            break;
         case FRONT_BACK:
            this.X.id_break(new rgN_2("^ v"));
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.id_finally();
         return true;
      }
   }

   private boolean id_class(ryM_2 var1) {
      rfH_2 var2 = new rfH_2(
         this.id_protected(this.id_char.id_private()), this.id_protected(this.id_abstract.id_private()), this.id_protected(this.id_long.id_private())
      );
      rfH_2 var3 = new rfH_2(
         this.id_protected(this.id_float.id_private()), this.id_protected(this.id_boolean.id_private()), this.id_protected(this.id_transient.id_private())
      );
      float var4 = this.id_byte(this.id_for.id_private());
      long var5 = this.id_class(this.id_double.id_private());
      this.id_volatile
         .id_void()
         .id_class(
            new rZp_1(
               this.id_return.id_char(),
               var1,
               this.id_return.id_package(),
               this.id_interface.id_private(),
               var2,
               var3,
               this.id_return.id_native(),
               this.id_return.id_volatile(),
               this.id_switch.id_private(),
               this.id_return.id_continue(),
               this.id_return.id_try(),
               this.id_return.id_instanceof(),
               var4,
               var5
            )
         );
      return true;
   }

   private long id_class(String var1) {
      try {
         return Long.valueOf(var1);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      rCD var5 = this.id_return.id_package();
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 10, 16777215);
      if (var5 != rCD.DATA) {
         id_break(var1, this.id_super, id_class, this.id_package / 2 - 153, 30, 10526880);
         this.id_interface.id_class(var1, var2, var3, var4);
      }

      if (var5 == rCD.LOAD || var5 == rCD.SAVE) {
         id_break(var1, this.id_super, id_throws, this.id_package / 2 - 153, 70, 10526880);
         this.id_char.id_class(var1, var2, var3, var4);
         this.id_abstract.id_class(var1, var2, var3, var4);
         this.id_long.id_class(var1, var2, var3, var4);
         id_break(var1, this.id_super, id_implements, this.id_package / 2 + 154 - this.id_super.id_class(id_implements), 150, 10526880);
      }

      if (var5 == rCD.SAVE) {
         id_break(var1, this.id_super, id_case, this.id_package / 2 - 153, 110, 10526880);
         this.id_float.id_class(var1, var2, var3, var4);
         this.id_boolean.id_class(var1, var2, var3, var4);
         this.id_transient.id_class(var1, var2, var3, var4);
         id_break(var1, this.id_super, id_finally, this.id_package / 2 + 154 - this.id_super.id_class(id_finally), 110, 10526880);
         id_break(var1, this.id_super, id_else, this.id_package / 2 + 154 - this.id_super.id_class(id_else), 70, 10526880);
      }

      if (var5 == rCD.LOAD) {
         id_break(var1, this.id_super, id_catch, this.id_package / 2 - 153, 110, 10526880);
         this.id_for.id_class(var1, var2, var3, var4);
         this.id_double.id_class(var1, var2, var3, var4);
         id_break(var1, this.id_super, id_synchronized, this.id_package / 2 + 154 - this.id_super.id_class(id_synchronized), 70, 10526880);
      }

      if (var5 == rCD.DATA) {
         id_break(var1, this.id_super, id_private, this.id_package / 2 - 153, 110, 10526880);
         this.id_switch.id_class(var1, var2, var3, var4);
      }

      id_break(var1, this.id_super, var5.id_break(), this.id_package / 2 - 153, 174, 10526880);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_interface.id_private();
      String var5 = this.id_char.id_private();
      String var6 = this.id_abstract.id_private();
      String var7 = this.id_long.id_private();
      String var8 = this.id_float.id_private();
      String var9 = this.id_boolean.id_private();
      String var10 = this.id_transient.id_private();
      String var11 = this.id_for.id_private();
      String var12 = this.id_double.id_private();
      String var13 = this.id_switch.id_private();
      this.id_break(var1, var2, var3);
      this.id_interface.id_class(var4);
      this.id_char.id_class(var5);
      this.id_abstract.id_class(var6);
      this.id_long.id_class(var7);
      this.id_float.id_class(var8);
      this.id_boolean.id_class(var9);
      this.id_transient.id_class(var10);
      this.id_for.id_class(var11);
      this.id_double.id_class(var12);
      this.id_switch.id_class(var13);
   }

   private void id_finally() {
      if (this.id_class(ryM_2.UPDATE_DATA)) {
         this.id_volatile.id_break((vm_3)null);
      }
   }

   private void id_package() {
      this.J.id_break(cN_2.id_class(this.id_return.id_try()));
   }

   private int id_protected(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void id_private() {
      this.id_interface.id_catch();
      this.id_char.id_catch();
      this.id_abstract.id_catch();
      this.id_long.id_catch();
      this.id_float.id_catch();
      this.id_boolean.id_catch();
      this.id_transient.id_catch();
      this.id_for.id_catch();
      this.id_double.id_catch();
      this.id_switch.id_catch();
   }

   private void id_abstract() {
      this.id_interface.id_private(false);
      this.id_char.id_private(false);
      this.id_abstract.id_private(false);
      this.id_long.id_private(false);
      this.id_float.id_private(false);
      this.id_boolean.id_private(false);
      this.id_transient.id_private(false);
      this.id_for.id_private(false);
      this.id_double.id_private(false);
      this.id_switch.id_private(false);
      this.B.id_new = false;
      this.S.id_new = false;
      this.O.id_new = false;
      this.h.id_new = false;
      this.X.id_new = false;
      this.s.id_new = false;
      this.E.id_new = false;
      this.G.id_new = false;
      this.b.id_new = false;
      this.J.id_new = false;
      this.x.id_new = false;
      switch (this.id_return.id_package()) {
         case SAVE:
            this.id_interface.id_private(true);
            this.id_char.id_private(true);
            this.id_abstract.id_private(true);
            this.id_long.id_private(true);
            this.id_float.id_private(true);
            this.id_boolean.id_private(true);
            this.id_transient.id_private(true);
            this.B.id_new = true;
            this.O.id_new = true;
            this.h.id_new = true;
            this.J.id_new = true;
            break;
         case LOAD:
            this.id_interface.id_private(true);
            this.id_char.id_private(true);
            this.id_abstract.id_private(true);
            this.id_long.id_private(true);
            this.id_for.id_private(true);
            this.id_double.id_private(true);
            this.S.id_new = true;
            this.h.id_new = true;
            this.X.id_new = true;
            this.s.id_new = true;
            this.E.id_new = true;
            this.G.id_new = true;
            this.b.id_new = true;
            this.x.id_new = true;
            this.id_char();
            break;
         case CORNER:
            this.id_interface.id_private(true);
            break;
         case DATA:
            this.id_switch.id_private(true);
      }

      this.M.id_break(new rgn_3("structure_block.mode." + this.id_return.id_package().id_class()));
   }

   private void id_final() {
      this.h.id_break(cN_2.id_class(!this.id_return.id_continue()));
   }

   @Override
   public void id_volatile() {
      this.id_native();
   }

   private void id_native() {
      this.id_return.id_class(this.id_public);
      this.id_return.id_class(this.id_goto);
      this.id_return.id_class(this.id_while);
      this.id_return.id_class(this.id_try);
      this.id_return.id_protected(this.id_instanceof);
      this.id_return.id_throws(this.id_throw);
      this.id_volatile.id_break((vm_3)null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.r = this.id_class((LF)(new LF(this.id_package / 2 - 4 - 150, 210, 150, 20, cN_2.id_byte, var1x -> this.id_finally())));
      this.P = this.id_class((LF)(new LF(this.id_package / 2 + 4, 210, 150, 20, cN_2.id_protected, var1x -> this.id_native())));
      this.B = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 185, 50, 20, new rgn_3("structure_block.button.save"), var1x -> {
         if (this.id_return.id_package() == rCD.SAVE) {
            this.id_class(ryM_2.SAVE_AREA);
            this.id_volatile.id_break((vm_3)null);
         }
      })));
      this.S = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 185, 50, 20, new rgn_3("structure_block.button.load"), var1x -> {
         if (this.id_return.id_package() == rCD.LOAD) {
            this.id_class(ryM_2.LOAD_AREA);
            this.id_volatile.id_break((vm_3)null);
         }
      })));
      this.M = this.id_class((LF)(new LF(this.id_package / 2 - 4 - 150, 185, 50, 20, new rgN_2("MODE"), var1x -> {
         this.id_return.id_new();
         this.id_abstract();
      })));
      this.O = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 120, 50, 20, new rgn_3("structure_block.button.detect_size"), var1x -> {
         if (this.id_return.id_package() == rCD.SAVE) {
            this.id_class(ryM_2.SCAN_AREA);
            this.id_volatile.id_break((vm_3)null);
         }
      })));
      this.h = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 160, 50, 20, new rgN_2("ENTITIES"), var1x -> {
         this.id_return.id_class(!this.id_return.id_continue());
         this.id_final();
      })));
      this.X = this.id_class((LF)(new LF(this.id_package / 2 - 20, 185, 40, 20, new rgN_2("MIRROR"), var1x -> {
         switch (this.id_return.id_native()) {
            case NONE:
               this.id_return.id_class(rpa_3.LEFT_RIGHT);
               break;
            case LEFT_RIGHT:
               this.id_return.id_class(rpa_3.FRONT_BACK);
               break;
            case FRONT_BACK:
               this.id_return.id_class(rpa_3.NONE);
         }

         this.id_interface();
      })));
      this.J = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 80, 50, 20, new rgN_2("SHOWAIR"), var1x -> {
         this.id_return.id_protected(!this.id_return.id_try());
         this.id_package();
      })));
      this.x = this.id_class((LF)(new LF(this.id_package / 2 + 4 + 100, 80, 50, 20, new rgN_2("SHOWBB"), var1x -> {
         this.id_return.id_throws(!this.id_return.id_instanceof());
         this.id_int();
      })));
      this.s = this.id_class((LF)(new LF(this.id_package / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, new rgN_2("0"), var1x -> {
         this.id_return.id_class(rqd_3.NONE);
         this.id_char();
      })));
      this.E = this.id_class((LF)(new LF(this.id_package / 2 - 1 - 40 - 20, 185, 40, 20, new rgN_2("90"), var1x -> {
         this.id_return.id_class(rqd_3.CLOCKWISE_90);
         this.id_char();
      })));
      this.G = this.id_class((LF)(new LF(this.id_package / 2 + 1 + 20, 185, 40, 20, new rgN_2("180"), var1x -> {
         this.id_return.id_class(rqd_3.CLOCKWISE_180);
         this.id_char();
      })));
      this.b = this.id_class((LF)(new LF(this.id_package / 2 + 1 + 40 + 1 + 20, 185, 40, 20, new rgN_2("270"), var1x -> {
         this.id_return.id_class(rqd_3.COUNTERCLOCKWISE_90);
         this.id_char();
      })));
      this.id_interface = new ZF(this, this.id_super, this.id_package / 2 - 152, 40, 300, 20, new rgn_3("structure_block.structure_name"));
      this.id_interface.id_implements(64);
      this.id_interface.id_class(this.id_return.id_throws());
      this.id_native.add(this.id_interface);
      rfH_2 var1 = this.id_return.id_finally();
      this.id_char = new Lu_1(this.id_super, this.id_package / 2 - 152, 80, 80, 20, new rgn_3("structure_block.position.x"));
      this.id_char.id_implements(15);
      this.id_char.id_class(Integer.toString(var1.b_()));
      this.id_native.add(this.id_char);
      this.id_abstract = new Lu_1(this.id_super, this.id_package / 2 - 72, 80, 80, 20, new rgn_3("structure_block.position.y"));
      this.id_abstract.id_implements(15);
      this.id_abstract.id_class(Integer.toString(var1.c_()));
      this.id_native.add(this.id_abstract);
      this.id_long = new Lu_1(this.id_super, this.id_package / 2 + 8, 80, 80, 20, new rgn_3("structure_block.position.z"));
      this.id_long.id_implements(15);
      this.id_long.id_class(Integer.toString(var1.d_()));
      this.id_native.add(this.id_long);
      rfH_2 var2 = this.id_return.id_extends();
      this.id_float = new Lu_1(this.id_super, this.id_package / 2 - 152, 120, 80, 20, new rgn_3("structure_block.size.x"));
      this.id_float.id_implements(15);
      this.id_float.id_class(Integer.toString(var2.b_()));
      this.id_native.add(this.id_float);
      this.id_boolean = new Lu_1(this.id_super, this.id_package / 2 - 72, 120, 80, 20, new rgn_3("structure_block.size.y"));
      this.id_boolean.id_implements(15);
      this.id_boolean.id_class(Integer.toString(var2.c_()));
      this.id_native.add(this.id_boolean);
      this.id_transient = new Lu_1(this.id_super, this.id_package / 2 + 8, 120, 80, 20, new rgn_3("structure_block.size.z"));
      this.id_transient.id_implements(15);
      this.id_transient.id_class(Integer.toString(var2.d_()));
      this.id_native.add(this.id_transient);
      this.id_for = new Lu_1(this.id_super, this.id_package / 2 - 152, 120, 80, 20, new rgn_3("structure_block.integrity.integrity"));
      this.id_for.id_implements(15);
      this.id_for.id_class(this.d.format((double)this.id_return.id_super()));
      this.id_native.add(this.id_for);
      this.id_double = new Lu_1(this.id_super, this.id_package / 2 - 72, 120, 80, 20, new rgn_3("structure_block.integrity.seed"));
      this.id_double.id_implements(31);
      this.id_double.id_class(Long.toString(this.id_return.id_this()));
      this.id_native.add(this.id_double);
      this.id_switch = new Lu_1(this.id_super, this.id_package / 2 - 152, 120, 240, 20, new rgn_3("structure_block.custom_data"));
      this.id_switch.id_implements(128);
      this.id_switch.id_class(this.id_return.id_final());
      this.id_native.add(this.id_switch);
      this.id_public = this.id_return.id_native();
      this.id_interface();
      this.id_goto = this.id_return.id_volatile();
      this.id_char();
      this.id_while = this.id_return.id_package();
      this.id_abstract();
      this.id_try = this.id_return.id_continue();
      this.id_final();
      this.id_instanceof = this.id_return.id_try();
      this.id_package();
      this.id_throw = this.id_return.id_instanceof();
      this.id_int();
      this.id_break(this.id_interface);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
