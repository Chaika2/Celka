package celestial;

import com.google.common.collect.ImmutableList;

public class vM_2 extends vm_3 {
   private static final QF[] id_class = new QF[]{QF.id_implements};
   private final vm_3 id_throws;
   private final Qw_1 id_case;
   private LF id_catch;
   private LH id_private;
   private rRO id_implements;

   private void id_byte(boolean var1) {
      this.id_volatile.id_break(this);
      if (var1 && (gm_3)this.id_volatile.id_class[56] != null) {
         this.id_volatile.id_void().id_class(new rZP(true));
         this.id_private.id_byte(true);
         this.id_private.id_int = false;
         this.id_catch.id_int = false;
      }
   }

   public vM_2(vm_3 var1, Qw_1 var2) {
      super(new rgn_3("options.title"));
      this.id_throws = var1;
      this.id_case = var2;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, 15, 16777215);
      super.id_class(var1, var2, var3, var4);
   }

   private rgP_2 id_class(rRO var1) {
      return new rgn_3("options.difficulty").id_break(": ").id_class(var1.id_break());
   }

   private void id_class(rAt_1 var1) {
      ImmutableList var2 = ImmutableList.copyOf(this.id_case.id_private);
      this.id_case.id_private.clear();
      this.id_case.id_implements.clear();

      for (rAp_1 var4 : var1.id_throws()) {
         if (!var4.id_catch()) {
            this.id_case.id_private.add(var4.id_throws());
            if (!var4.id_byte().id_class()) {
               this.id_case.id_implements.add(var4.id_throws());
            }
         }
      }

      this.id_case.id_break();
      ImmutableList var5 = ImmutableList.copyOf(this.id_case.id_private);
      if (!var5.equals(var2)) {
         this.id_volatile.id_private();
      }
   }

   @Override
   protected void v_() {
      int var1 = 0;

      for (QF var5 : id_class) {
         int var6 = this.id_package / 2 - 155 + var1 % 2 * 160;
         int var7 = this.id_int / 6 - 12 + 24 * (var1 >> 1);
         this.id_class(var5.id_class((Qw_1)this.id_volatile.id_class[20], var6, var7, (gm_3)this.id_volatile.id_class[56] != null ? 150 : 310));
         var1++;
      }

      if ((gm_3)this.id_volatile.id_class[56] != null) {
         this.id_implements = ((gm_3)this.id_volatile.id_class[56]).id_abstract();
         this.id_catch = this.id_class(
            (LF)(new LF(
               this.id_package / 2 - 155 + var1 % 2 * 160, this.id_int / 6 - 12 + 24 * (var1 >> 1), 150, 20, this.id_class(this.id_implements), var1x -> {
                  this.id_implements = rRO.id_class(this.id_implements.id_class() + 1);
                  this.id_volatile.id_void().id_class(new rZZ(this.id_implements));
                  this.id_catch.id_break(this.id_class(this.id_implements));
               }
            ))
         );
         if (this.id_volatile.id_finally() && !((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_implements()) {
            this.id_catch.id_int(this.id_catch.id_case() - 20);
            this.id_private = this.id_class(
               new LH(
                  this.id_catch.id_volatile + this.id_catch.id_case(),
                  this.id_catch.id_final,
                  var1x -> this.id_volatile
                        .id_break(
                           new mT_2(
                              this::id_byte,
                              new rgn_3("difficulty.lock.title"),
                              new rgn_3(
                                 "difficulty.lock.question",
                                 new rgn_3("options.difficulty." + ((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_extends().id_byte())
                              )
                           )
                        )
               )
            );
            this.id_private.id_byte(((gm_3)this.id_volatile.id_class[56]).id_synchronized().id_native());
            this.id_private.id_int = !this.id_private.id_private();
            this.id_catch.id_int = !this.id_private.id_private();
         } else {
            this.id_catch.id_int = false;
         }
      }

      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 155,
            this.id_int / 6 + 48 - 6,
            150,
            20,
            new rgn_3("options.skinCustomisation"),
            var1x -> this.id_volatile.id_break(new ZP(this, this.id_case))
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 5,
            this.id_int / 6 + 48 - 6,
            150,
            20,
            new rgn_3("options.sounds"),
            var1x -> this.id_volatile.id_break(new vO_2(this, this.id_case))
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 155,
            this.id_int / 6 + 72 - 6,
            150,
            20,
            new rgn_3("options.video"),
            var1x -> this.id_volatile.id_break(new vV_2(this, this.id_case))
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 5,
            this.id_int / 6 + 72 - 6,
            150,
            20,
            new rgn_3("options.controls"),
            var1x -> this.id_volatile.id_break(new mI_2(this, this.id_case))
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 - 155,
            this.id_int / 6 + 96 - 6,
            150,
            20,
            new rgn_3("options.language"),
            var1x -> this.id_volatile.id_break(new ZU(this, this.id_case, this.id_volatile.u()))
         ))
      );
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 5,
            this.id_int / 6 + 96 - 6,
            150,
            20,
            new rgn_3("options.chat.title"),
            var1x -> this.id_volatile.id_break(new mC_2(this, this.id_case))
         ))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 155, this.id_int / 6 + 120 - 6, 150, 20, new rgn_3("options.resourcepack"), var1x -> {
         vk_3 var2 = new vk_3(this, this.id_volatile.id_char(), this::id_class, this.id_volatile.h(), new rgn_3("resourcePack.title"));
         this.id_volatile.id_break(new rAO(var2));
      })));
      this.id_class(
         (LF)(new LF(
            this.id_package / 2 + 5,
            this.id_int / 6 + 120 - 6,
            150,
            20,
            new rgn_3("options.accessibility.title"),
            var1x -> this.id_volatile.id_break(new cJ_2(this, this.id_case))
         ))
      );
      this.id_class((LF)(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, cN_2.id_byte, var1x -> this.id_volatile.id_break(this.id_throws))));
   }

   @Override
   public void w_() {
      super.w_();
      this.id_case.id_break();
   }
}
