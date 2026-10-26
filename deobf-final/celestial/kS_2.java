package celestial;

public class kS_2 extends dB_2 {
   public static final rCc_1 volatile_ = rCT.const_;
   public static final rCN final_ = rCT.case_;
   private static final rjC_2 package_ = xd_3.class_(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 int_ = xd_3.class_(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final rjC_2 new_ = rjw_3.class_(int_, package_);
   private static final rjC_2 continue_ = rjw_3.class_(new_, rHI.class_, rjN_2.throws_);
   private static final rjC_2 super_ = rjw_3.class_(continue_, xd_3.class_(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final rjC_2 this_ = rjw_3.class_(continue_, xd_3.class_(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final rjC_2 else_ = rjw_3.class_(continue_, xd_3.class_(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final rjC_2 synchronized_ = rjw_3.class_(continue_, xd_3.class_(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final rjC_2 return_ = rjw_3.class_(continue_, xd_3.class_(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final rjC_2 public_ = rHI.class_;
   private static final rjC_2 goto_ = rjw_3.class_(rHI.class_, xd_3.class_(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final rjC_2 while_ = rjw_3.class_(rHI.class_, xd_3.class_(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final rjC_2 try_ = rjw_3.class_(rHI.class_, xd_3.class_(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final rjC_2 instanceof_ = rjw_3.class_(rHI.class_, xd_3.class_(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rjC_2 byte_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.util.ConcurrentModificationException
      //   at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
      //   at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.findExprents(SwitchHelper.java:538)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.getAssignmentsOfWithinOneStatement(SwitchHelper.java:512)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplify(SwitchHelper.java:61)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:30)
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:84)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:348)
      //   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:474)
      //   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:191)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:187)
      //
      // Bytecode:
      // 00: getstatic celestial/ks_3.class_ [I
      // 03: aload 1
      // 04: getstatic celestial/kS_2.volatile_ Lcelestial/rCc_1;
      // 07: invokevirtual celestial/xc_3.byte_ (Lcelestial/rCZ;)Ljava/lang/Comparable;
      // 0a: checkcast celestial/rpr_3
      // 0d: invokevirtual celestial/rpr_3.ordinal ()I
      // 10: iaload
      // 11: tableswitch 55 1 5 35 39 43 47 51
      // 34: getstatic celestial/kS_2.public_ Lcelestial/rjC_2;
      // 37: areturn
      // 38: getstatic celestial/kS_2.while_ Lcelestial/rjC_2;
      // 3b: areturn
      // 3c: getstatic celestial/kS_2.try_ Lcelestial/rjC_2;
      // 3f: areturn
      // 40: getstatic celestial/kS_2.instanceof_ Lcelestial/rjC_2;
      // 43: areturn
      // 44: getstatic celestial/kS_2.goto_ Lcelestial/rjC_2;
      // 47: areturn
      // 48: getstatic celestial/rHI.class_ Lcelestial/rjC_2;
      // 4b: areturn
   }

   public kS_2(Jq_1 var1) {
      super(var1);
      this.extends_(this.abstract_.break_().class_(volatile_, rpr_3.DOWN).class_(final_, Boolean.valueOf(true)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      return var1.class_(var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      return var1.class_(volatile_, var2.class_(var1.byte_(volatile_)));
   }

   @Override
   public xN_2 class_(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      switch ((rpr_3)var1.byte_(volatile_)) {
         case DOWN:
            return super_;
         case NORTH:
            return else_;
         case SOUTH:
            return synchronized_;
         case WEST:
            return return_;
         case EAST:
            return this_;
         default:
            return continue_;
      }
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(volatile_, final_);
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      ryO_2 var5 = var2.class_(var3);
      if (var5 instanceof rHt_1) {
         ((rHt_1)var5).class_(var4);
      }
   }

   @Override
   public boolean class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryZ_2 class_(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.continue_) {
         return ryZ_2.SUCCESS;
      } else {
         ryO_2 var7 = var2.class_(var3);
         if (var7 instanceof rHt_1) {
            var4.class_((rHt_1)var7);
            var4.break_(rlB_2.M);
         }

         return ryZ_2.CONSUME;
      }
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.class_(var1.break_())) {
         this.class_(var2, var3, var1);
      }
   }

   @Override
   public void class_(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var5.this_()) {
         ryO_2 var6 = var1.class_(var2);
         if (var6 instanceof rHt_1) {
            ((rHt_1)var6).class_(var5.continue_());
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHt_1();
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      rpr_3 var2 = var1.finally_().case_();
      return this.continue_().class_(volatile_, var2.final_() == rpB_2.Y ? rpr_3.DOWN : var2).class_(final_, Boolean.valueOf(true));
   }

   @Override
   public void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      this.class_(var2, var3, var1);
   }

   private void class_(rYB var1, rfH_2 var2, xc_3 var3) {
      boolean var4 = !var1.public_(var2);
      if (var4 != var3.byte_(final_)) {
         var1.class_(var2, var3.class_(final_, Boolean.valueOf(var4)), 4);
      }
   }

   @Override
   public void break_(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.class_(var4.break_())) {
         ryO_2 var6 = var2.class_(var3);
         if (var6 instanceof rHt_1) {
            rXn_1.class_(var2, var3, (rHt_1)var6);
            var2.byte_(var3, this);
         }

         super.break_(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int break_(xc_3 var1, rYB var2, rfH_2 var3) {
      return rJr_1.class_(var2.class_(var3));
   }

   @Override
   public boolean case_(xc_3 var1) {
      return true;
   }
}
