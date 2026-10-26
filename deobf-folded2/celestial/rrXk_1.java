package celestial;

public enum rrXk_1 {
   POS_X("tx"),
   POS_Y("ty"),
   POS_Z("tz"),
   ANGLE_X("rx"),
   ANGLE_Y("ry"),
   ANGLE_Z("rz"),
   SCALE_X("sx"),
   SCALE_Y("sy"),
   SCALE_Z("sz");

   private String name;
   public static rrXk_1[] VALUES = values();

   private rrXk_1(String var3) {
      this.name = var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float id_class(Iq_1 var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: invalid constant type: Lcelestial/rrXk_1; with value 3
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:356)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:170)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: getstatic celestial/rrXW.id_class [I
      // 03: aload 0
      // 04: invokevirtual celestial/rrXk_1.ordinal ()I
      // 07: iaload
      // 08: tableswitch 97 1 9 52 57 62 67 72 77 82 87 92
      // 3c: aload 1
      // 3d: getfield celestial/Iq_1.id_byte F
      // 40: freturn
      // 41: aload 1
      // 42: getfield celestial/Iq_1.id_protected F
      // 45: freturn
      // 46: aload 1
      // 47: getfield celestial/Iq_1.id_throws F
      // 4a: freturn
      // 4b: aload 1
      // 4c: getfield celestial/Iq_1.id_case F
      // 4f: freturn
      // 50: aload 1
      // 51: getfield celestial/Iq_1.id_catch F
      // 54: freturn
      // 55: aload 1
      // 56: getfield celestial/Iq_1.id_private F
      // 59: freturn
      // 5a: aload 1
      // 5b: getfield celestial/Iq_1.id_package F
      // 5e: freturn
      // 5f: aload 1
      // 60: getfield celestial/Iq_1.id_int F
      // 63: freturn
      // 64: aload 1
      // 65: getfield celestial/Iq_1.id_new F
      // 68: freturn
      // 69: aload 0
      // 6a: invokedynamic makeConcatWithConstants (Lcelestial/rrXk_1;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "GetFloat not supported for: \u0001" ]
      // 6f: invokestatic celestial/rrbb_3.id_protected (Ljava/lang/String;)V
      // 72: fconst_0
      // 73: freturn
   }

   public static rrXk_1 id_class(String var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXk_1 var2 = VALUES[var1];
         if (var2.id_class().equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   public void id_class(Iq_1 var1, float var2) {
      switch (this) {
         case POS_X:
            var1.id_byte = var2;
            return;
         case POS_Y:
            var1.id_protected = var2;
            return;
         case POS_Z:
            var1.id_throws = var2;
            return;
         case ANGLE_X:
            var1.id_case = var2;
            return;
         case ANGLE_Y:
            var1.id_catch = var2;
            return;
         case ANGLE_Z:
            var1.id_private = var2;
            return;
         case SCALE_X:
            var1.id_package = var2;
            return;
         case SCALE_Y:
            var1.id_int = var2;
            return;
         case SCALE_Z:
            var1.id_new = var2;
            return;
         default:
            rrbb_3.id_protected("SetFloat not supported for: " + this);
      }
   }

   public String id_class() {
      return this.name;
   }
}
