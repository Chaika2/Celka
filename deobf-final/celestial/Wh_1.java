package celestial;

public class Wh_1 extends Jo_1 {
   public static final rCu_1<rCR> package_ = rCT.M;

   protected Wh_1(Jq_1 var1) {
      super(false, var1);
      this.extends_(this.abstract_.break_().class_(package_, rCR.NORTH_SOUTH));
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(package_);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
            }
         case COUNTERCLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
            }
         case CLOCKWISE_90:
            switch ((rCR)var1.byte_(package_)) {
               case ASCENDING_EAST:
                  return var1.class_(package_, rCR.ASCENDING_SOUTH);
               case ASCENDING_WEST:
                  return var1.class_(package_, rCR.ASCENDING_NORTH);
               case ASCENDING_NORTH:
                  return var1.class_(package_, rCR.ASCENDING_EAST);
               case ASCENDING_SOUTH:
                  return var1.class_(package_, rCR.ASCENDING_WEST);
               case SOUTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_WEST);
               case SOUTH_WEST:
                  return var1.class_(package_, rCR.NORTH_WEST);
               case NORTH_WEST:
                  return var1.class_(package_, rCR.NORTH_EAST);
               case NORTH_EAST:
                  return var1.class_(package_, rCR.SOUTH_EAST);
               case NORTH_SOUTH:
                  return var1.class_(package_, rCR.EAST_WEST);
               case EAST_WEST:
                  return var1.class_(package_, rCR.NORTH_SOUTH);
            }
         default:
            return var1;
      }
   }

   @Override
   protected void class_(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
      if (var4.continue_().implements_() && new WJ(var2, var3, var1).break_() == 3) {
         this.class_(var2, var3, var1, false);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 class_(xc_3 var1, rpa_3 var2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rCR; with value 4
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:185)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 004: invokevirtual celestial/xc_3.byte_ (Lcelestial/rCZ;)Ljava/lang/Comparable;
      // 007: checkcast celestial/rCR
      // 00a: astore 3
      // 00b: getstatic celestial/WX.byte_ [I
      // 00e: aload 2
      // 00f: invokevirtual celestial/rpa_3.ordinal ()I
      // 012: iaload
      // 013: lookupswitch 304 2 1 25 2 164
      // 02c: getstatic celestial/WX.class_ [I
      // 02f: aload 3
      // 030: invokevirtual celestial/rCR.ordinal ()I
      // 033: iaload
      // 034: tableswitch 124 3 8 40 54 68 82 96 110
      // 05c: aload 1
      // 05d: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 060: getstatic celestial/rCR.ASCENDING_SOUTH Lcelestial/rCR;
      // 063: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 066: checkcast celestial/xc_3
      // 069: areturn
      // 06a: aload 1
      // 06b: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 06e: getstatic celestial/rCR.ASCENDING_NORTH Lcelestial/rCR;
      // 071: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 074: checkcast celestial/xc_3
      // 077: areturn
      // 078: aload 1
      // 079: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 07c: getstatic celestial/rCR.NORTH_EAST Lcelestial/rCR;
      // 07f: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 082: checkcast celestial/xc_3
      // 085: areturn
      // 086: aload 1
      // 087: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 08a: getstatic celestial/rCR.NORTH_WEST Lcelestial/rCR;
      // 08d: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 090: checkcast celestial/xc_3
      // 093: areturn
      // 094: aload 1
      // 095: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 098: getstatic celestial/rCR.SOUTH_WEST Lcelestial/rCR;
      // 09b: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 09e: checkcast celestial/xc_3
      // 0a1: areturn
      // 0a2: aload 1
      // 0a3: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 0a6: getstatic celestial/rCR.SOUTH_EAST Lcelestial/rCR;
      // 0a9: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 0ac: checkcast celestial/xc_3
      // 0af: areturn
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: aload 2
      // 0b3: invokespecial celestial/Jo_1.class_ (Lcelestial/xc_3;Lcelestial/rpa_3;)Lcelestial/xc_3;
      // 0b6: areturn
      // 0b7: getstatic celestial/WX.class_ [I
      // 0ba: aload 3
      // 0bb: invokevirtual celestial/rCR.ordinal ()I
      // 0be: iaload
      // 0bf: tableswitch 73 1 8 45 59 73 73 76 90 104 118
      // 0ec: aload 1
      // 0ed: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 0f0: getstatic celestial/rCR.ASCENDING_WEST Lcelestial/rCR;
      // 0f3: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 0f6: checkcast celestial/xc_3
      // 0f9: areturn
      // 0fa: aload 1
      // 0fb: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 0fe: getstatic celestial/rCR.ASCENDING_EAST Lcelestial/rCR;
      // 101: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 104: checkcast celestial/xc_3
      // 107: areturn
      // 108: goto 143
      // 10b: aload 1
      // 10c: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 10f: getstatic celestial/rCR.SOUTH_WEST Lcelestial/rCR;
      // 112: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 115: checkcast celestial/xc_3
      // 118: areturn
      // 119: aload 1
      // 11a: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 11d: getstatic celestial/rCR.SOUTH_EAST Lcelestial/rCR;
      // 120: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 123: checkcast celestial/xc_3
      // 126: areturn
      // 127: aload 1
      // 128: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 12b: getstatic celestial/rCR.NORTH_EAST Lcelestial/rCR;
      // 12e: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 131: checkcast celestial/xc_3
      // 134: areturn
      // 135: aload 1
      // 136: getstatic celestial/Wh_1.package_ Lcelestial/rCu_1;
      // 139: getstatic celestial/rCR.NORTH_WEST Lcelestial/rCR;
      // 13c: invokevirtual celestial/xc_3.class_ (Lcelestial/rCZ;Ljava/lang/Comparable;)Ljava/lang/Object;
      // 13f: checkcast celestial/xc_3
      // 142: areturn
      // 143: aload 0
      // 144: aload 1
      // 145: aload 2
      // 146: invokespecial celestial/Jo_1.class_ (Lcelestial/xc_3;Lcelestial/rpa_3;)Lcelestial/xc_3;
      // 149: areturn
   }

   @Override
   public rCZ<rCR> implements_() {
      return package_;
   }
}
