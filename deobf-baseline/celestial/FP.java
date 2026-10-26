package celestial;

public class FP extends vm_3 {
   private String id_throws = "";
   private int id_case = -1;
   public Lu_1 id_class;
   private final String id_catch;
   cW_2 id_private;

   private void id_byte(String var1) {
      this.id_class.id_class(var1);
   }

   public FP(String var1) {
      super(rgN_2.id_byte);
      this.id_catch = var1;
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      if (var5 > 1.0) {
         var5 = 1.0;
      }

      if (var5 < -1.0) {
         var5 = -1.0;
      }

      if (this.id_private.id_class(var5)) {
         return true;
      } else {
         if (!id_synchronized()) {
            var5 *= 7.0;
         }

         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(var5);
         return true;
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5);
      return super.id_class(var1, var3, var5);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (this.id_private.id_class(var1, var2, var3)) {
         return true;
      } else if (super.id_class(var1, var2, var3)) {
         return true;
      } else if (var1 == 256) {
         this.id_volatile.id_break(null);
         return true;
      } else if (var1 == 257 || var1 == 335) {
         String var4 = this.id_class.id_private().trim();
         if (!var4.isEmpty()) {
            this.id_break(var4);
         }

         this.id_volatile.id_break(null);
         return true;
      } else if (var1 == 265) {
         this.id_break(-1);
         return true;
      } else if (var1 == 264) {
         this.id_break(1);
         return true;
      } else if (var1 == 266) {
         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class((double)(((cq_3)this.id_volatile.id_class[19]).id_throws().id_implements() - 1));
         return true;
      } else if (var1 == 267) {
         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class((double)(-((cq_3)this.id_volatile.id_class[19]).id_throws().id_implements() + 1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void id_class(String var1, boolean var2) {
      if (var2) {
         this.id_class.id_class(var1);
      } else {
         this.id_class.id_break(var1);
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(this.id_class);
      this.id_class.id_byte(true);
      id_class(var1, 2, this.id_int - 14, this.id_package - 2, this.id_int - 2, ((Qw_1)this.id_volatile.id_class[20]).id_class(Integer.MIN_VALUE));
      this.id_class.id_class(var1, var2, var3, var4);
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_protected(this.id_class.id_private())) {
         BlurShader.id_class(
            var1,
            () -> id_class(
                  var1, 2, this.id_int - 14, Math.min(this.id_class.id_case() + 6, this.id_super.id_break(this.id_class.id_private()) + 5), this.id_int - 2, -1
               ),
            10.0F
         );
      }

      this.id_private.id_class(var1, var2, var3);
      rgc_3 var5 = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_break((double)var2, (double)var3);
      if (var5 != null && var5.id_implements() != null) {
         this.id_class(var1, var5, var2, var3);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_class.id_private();
      this.id_break(var1, var2, var3);
      this.id_byte(var4);
      this.id_private.id_class();
   }

   private void id_class(String var1) {
      String var2 = this.id_class.id_private();
      this.id_private.id_class(!var2.equals(this.id_catch));
      this.id_private.id_class();
   }

   public void id_break(int var1) {
      int var2 = this.id_case + var1;
      int var3 = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().size();
      var2 = rfU_2.id_class(var2, 0, var3);
      if (var2 != this.id_case) {
         if (var2 == var3) {
            this.id_case = var3;
            this.id_class.id_class(this.id_throws);
         } else {
            if (this.id_case == var3) {
               this.id_throws = this.id_class.id_private();
            }

            this.id_class.id_class(((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().get(var2));
            this.id_private.id_class(false);
            this.id_case = var2;
         }
      }
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
         .id_class()
         .id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], var5, true, false);
      if (this.id_private.id_class((double)((int)var1), (double)((int)var3), var5)) {
         return true;
      } else {
         if (var5 == 0) {
            cI_2 var6 = ((cq_3)this.id_volatile.id_class[19]).id_throws();
            if (var6.id_class(var1, var3)) {
               return true;
            }

            rgc_3 var7 = var6.id_break(var1, var3);
            if (var7 != null && this.id_class(var7)) {
               return true;
            }
         }

         return this.id_class.id_break(var1, var3, var5) || super.id_break(var1, var3, var5);
      }
   }

   public cW_2 id_finally() {
      return this.id_private;
   }

   @Override
   public void id_private() {
      this.id_class.id_catch();
   }

   @Override
   public void id_volatile() {
      super.id_volatile();
   }

   @Override
   protected void v_() {
      short var1 = 130;
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      this.id_case = ((cq_3)this.id_volatile.id_class[19]).id_throws().id_protected().size();
      this.id_class = new FB(this, this.id_super, 4, this.id_int - 12, this.id_package - var1 - 10, 12, new rgn_3("chat.editBox"));
      this.id_class.id_implements(Integer.MAX_VALUE);
      this.id_class.id_protected(false);
      this.id_class.id_class(this.id_catch);
      this.id_class.id_class(this::id_class);
      this.id_native.add(this.id_class);
      this.id_private = new cW_2(this.id_volatile, this, this.id_class, this.id_super, false, false, 1, 10, true, -805306368);
      this.id_private.id_class();
      this.id_break(this.id_class);
   }

   @Override
   public boolean z_() {
      return false;
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
      ((cq_3)this.id_volatile.id_class[19]).id_throws().id_throws();
      this.id_class.id_byte(false);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_class((Integer)rrvk_1.id_class[0], (Integer)rrvk_1.id_class[1], 0);
   }
}
