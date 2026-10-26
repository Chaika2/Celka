package celestial;

public enum rrXc_1 implements rrXf_1 {
   LIMB_SWING("limb_swing"),
   LIMB_SWING_SPEED("limb_speed"),
   AGE("age"),
   HEAD_YAW("head_yaw"),
   HEAD_PITCH("head_pitch"),
   HEALTH("health"),
   HURT_TIME("hurt_time"),
   IDLE_TIME("idle_time"),
   MAX_HEALTH("max_health"),
   MOVE_FORWARD("move_forward"),
   MOVE_STRAFING("move_strafing"),
   PARTIAL_TICKS("partial_ticks"),
   POS_X("pos_x"),
   POS_Y("pos_y"),
   POS_Z("pos_z"),
   REVENGE_TIME("revenge_time"),
   SWING_PROGRESS("swing_progress");

   private String name;
   private pg_3 renderManager;
   private static final rrXc_1[] VALUES = values();

   private rrXc_1(String var3) {
      this.name = var3;
      this.renderManager = QY.instanceof_().case_();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public float class_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rrXc_1; with value 13
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:185)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:261)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield celestial/rrXc_1.renderManager Lcelestial/pg_3;
      // 004: getfield celestial/pg_3.throws_ Lcelestial/pV_2;
      // 007: astore 1
      // 008: aload 1
      // 009: ifnonnull 00e
      // 00c: fconst_0
      // 00d: freturn
      // 00e: aload 1
      // 00f: instanceof celestial/qd_3
      // 012: ifeq 108
      // 015: aload 1
      // 016: checkcast celestial/qd_3
      // 019: astore 2
      // 01a: getstatic celestial/rrXu_1.class_ [I
      // 01d: aload 0
      // 01e: invokevirtual celestial/rrXc_1.ordinal ()I
      // 021: iaload
      // 022: tableswitch 59 12 16 34 39 44 49 54
      // 044: aload 2
      // 045: getfield celestial/qd_3.private_ F
      // 048: freturn
      // 049: aload 2
      // 04a: getfield celestial/qd_3.implements_ F
      // 04d: freturn
      // 04e: aload 2
      // 04f: getfield celestial/qd_3.finally_ F
      // 052: freturn
      // 053: aload 2
      // 054: getfield celestial/qd_3.extends_ F
      // 057: freturn
      // 058: aload 2
      // 059: getfield celestial/qd_3.native_ F
      // 05c: freturn
      // 05d: aload 2
      // 05e: getfield celestial/qd_3.catch_ Lcelestial/iB_2;
      // 061: astore 3
      // 062: aload 3
      // 063: ifnonnull 068
      // 066: fconst_0
      // 067: freturn
      // 068: getstatic celestial/rrXu_1.class_ [I
      // 06b: aload 0
      // 06c: invokevirtual celestial/rrXc_1.ordinal ()I
      // 06f: iaload
      // 070: tableswitch 152 1 11 60 65 80 86 91 105 119 125 131 137 143
      // 0ac: aload 3
      // 0ad: invokevirtual celestial/iB_2.Ss ()F
      // 0b0: freturn
      // 0b1: aload 3
      // 0b2: getfield celestial/iB_2.private_ [Ljava/lang/Object;
      // 0b5: ldc 10
      // 0b7: aaload
      // 0b8: checkcast java/lang/Integer
      // 0bb: invokevirtual java/lang/Integer.intValue ()I
      // 0be: i2f
      // 0bf: freturn
      // 0c0: aload 3
      // 0c1: invokevirtual celestial/iB_2.BI ()I
      // 0c4: i2f
      // 0c5: freturn
      // 0c6: aload 3
      // 0c7: invokevirtual celestial/iB_2.SK ()F
      // 0ca: freturn
      // 0cb: aload 3
      // 0cc: getfield celestial/iB_2.private_ [Ljava/lang/Object;
      // 0cf: ldc 44
      // 0d1: aaload
      // 0d2: checkcast java/lang/Float
      // 0d5: invokevirtual java/lang/Float.floatValue ()F
      // 0d8: freturn
      // 0d9: aload 3
      // 0da: getfield celestial/iB_2.private_ [Ljava/lang/Object;
      // 0dd: ldc 42
      // 0df: aaload
      // 0e0: checkcast java/lang/Float
      // 0e3: invokevirtual java/lang/Float.floatValue ()F
      // 0e6: freturn
      // 0e7: aload 3
      // 0e8: invokevirtual celestial/iB_2.rx ()D
      // 0eb: d2f
      // 0ec: freturn
      // 0ed: aload 3
      // 0ee: invokevirtual celestial/iB_2.re ()D
      // 0f1: d2f
      // 0f2: freturn
      // 0f3: aload 3
      // 0f4: invokevirtual celestial/iB_2.BO ()D
      // 0f7: d2f
      // 0f8: freturn
      // 0f9: aload 3
      // 0fa: invokevirtual celestial/iB_2.Sb ()I
      // 0fd: i2f
      // 0fe: freturn
      // 0ff: aload 3
      // 100: aload 2
      // 101: getfield celestial/qd_3.volatile_ F
      // 104: invokevirtual celestial/iB_2.goto_ (F)F
      // 107: freturn
      // 108: fconst_0
      // 109: freturn
   }

   public static rrXc_1 class_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrXc_1 var2 = VALUES[var1];
            if (var2.break_().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }

   public String break_() {
      return this.name;
   }
}
