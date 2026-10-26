package celestial;

public enum rrkc_1 implements rrXw_1 {
   IS_ALIVE("is_alive"),
   IS_BURNING("is_burning"),
   IS_CHILD("is_child"),
   IS_GLOWING("is_glowing"),
   IS_HURT("is_hurt"),
   IS_IN_LAVA("is_in_lava"),
   IS_IN_WATER("is_in_water"),
   IS_INVISIBLE("is_invisible"),
   IS_ON_GROUND("is_on_ground"),
   IS_RIDDEN("is_ridden"),
   IS_RIDING("is_riding"),
   IS_SNEAKING("is_sneaking"),
   IS_SPRINTING("is_sprinting"),
   IS_WET("is_wet");

   private String name;
   private pg_3 renderManager;
   private static final rrkc_1[] VALUES = values();

   private rrkc_1(String var3) {
      this.name = var3;
      this.renderManager = QY.id_instanceof().id_case();
   }

   public static rrkc_1 id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrkc_1 var2 = VALUES[var1];
            if (var2.id_class().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }

   public String id_class() {
      return this.name;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean id_break() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rrkc_1; with value 13
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:241)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: invokestatic celestial/QY.id_instanceof ()Lcelestial/QY;
      // 03: invokevirtual celestial/QY.id_catch ()Lcelestial/an_3;
      // 06: astore 1
      // 07: aload 1
      // 08: instanceof celestial/iB_2
      // 0b: ifeq b7
      // 0e: aload 1
      // 0f: checkcast celestial/iB_2
      // 12: astore 2
      // 13: getstatic celestial/rrku_1.id_class [I
      // 16: aload 0
      // 17: invokevirtual celestial/rrkc_1.ordinal ()I
      // 1a: iaload
      // 1b: tableswitch 156 1 14 69 74 79 84 89 111 116 121 126 131 136 141 146 151
      // 60: aload 2
      // 61: invokevirtual celestial/iB_2.BM ()Z
      // 64: ireturn
      // 65: aload 2
      // 66: invokevirtual celestial/iB_2.Pz ()Z
      // 69: ireturn
      // 6a: aload 2
      // 6b: invokevirtual celestial/iB_2.n_ ()Z
      // 6e: ireturn
      // 6f: aload 2
      // 70: invokevirtual celestial/iB_2.w ()Z
      // 73: ireturn
      // 74: aload 2
      // 75: getfield celestial/iB_2.id_private [Ljava/lang/Object;
      // 78: ldc 10
      // 7a: aaload
      // 7b: checkcast java/lang/Integer
      // 7e: invokevirtual java/lang/Integer.intValue ()I
      // 81: ifle 88
      // 84: bipush 1
      // 85: goto 89
      // 88: bipush 0
      // 89: ireturn
      // 8a: aload 2
      // 8b: invokevirtual celestial/iB_2.ry ()Z
      // 8e: ireturn
      // 8f: aload 2
      // 90: invokevirtual celestial/iB_2.rT ()Z
      // 93: ireturn
      // 94: aload 2
      // 95: invokevirtual celestial/iB_2.Pp ()Z
      // 98: ireturn
      // 99: aload 2
      // 9a: invokevirtual celestial/iB_2.BL ()Z
      // 9d: ireturn
      // 9e: aload 2
      // 9f: invokevirtual celestial/iB_2.BP ()Z
      // a2: ireturn
      // a3: aload 2
      // a4: invokevirtual celestial/iB_2.Pm ()Z
      // a7: ireturn
      // a8: aload 2
      // a9: invokevirtual celestial/iB_2.x ()Z
      // ac: ireturn
      // ad: aload 2
      // ae: invokevirtual celestial/iB_2.PF ()Z
      // b1: ireturn
      // b2: aload 2
      // b3: invokevirtual celestial/iB_2.Pf ()Z
      // b6: ireturn
      // b7: bipush 0
      // b8: ireturn
   }
}
