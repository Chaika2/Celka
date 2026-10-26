package celestial;

public abstract class Jo_1 extends xd_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean id_package;

   protected Jo_1(boolean var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue && var2.id_byte(var3).id_class(this)) {
         rCR var7 = var1.id_byte(this.id_implements());
         if (id_class(var3, var2, var7)) {
            id_protected(var1, var2, var3);
            var2.id_class(var3, var6);
         } else {
            this.id_class(var1, var2, var3, var4);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean id_class(rfH_2 var0, rYB var1, rCR var2) {
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
      //   at org.jetbrains.java.decompiler.modules.decompiler.SwitchHelper.simplifySwitches(SwitchHelper.java:34)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.invokeProcessors(ClassWriter.java:84)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeClass(ClassWriter.java:348)
      //   at org.jetbrains.java.decompiler.main.ClassesProcessor.writeClass(ClassesProcessor.java:474)
      //   at org.jetbrains.java.decompiler.main.Fernflower.getClassContent(Fernflower.java:191)
      //   at org.jetbrains.java.decompiler.struct.ContextUnit.lambda$save$3(ContextUnit.java:187)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 0
      // 02: invokevirtual celestial/rfH_2.id_break ()Lcelestial/rfH_2;
      // 05: invokestatic celestial/Jo_1.id_byte (Lcelestial/rRq_1;Lcelestial/rfH_2;)Z
      // 08: ifne 0d
      // 0b: bipush 1
      // 0c: ireturn
      // 0d: getstatic celestial/JK.id_class [I
      // 10: aload 2
      // 11: invokevirtual celestial/rCR.ordinal ()I
      // 14: iaload
      // 15: tableswitch 99 1 4 31 48 65 82
      // 34: aload 1
      // 35: aload 0
      // 36: invokevirtual celestial/rfH_2.id_extends ()Lcelestial/rfH_2;
      // 39: invokestatic celestial/Jo_1.id_byte (Lcelestial/rRq_1;Lcelestial/rfH_2;)Z
      // 3c: ifne 43
      // 3f: bipush 1
      // 40: goto 44
      // 43: bipush 0
      // 44: ireturn
      // 45: aload 1
      // 46: aload 0
      // 47: invokevirtual celestial/rfH_2.id_byte ()Lcelestial/rfH_2;
      // 4a: invokestatic celestial/Jo_1.id_byte (Lcelestial/rRq_1;Lcelestial/rfH_2;)Z
      // 4d: ifne 54
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
      // 56: aload 1
      // 57: aload 0
      // 58: invokevirtual celestial/rfH_2.id_private ()Lcelestial/rfH_2;
      // 5b: invokestatic celestial/Jo_1.id_byte (Lcelestial/rRq_1;Lcelestial/rfH_2;)Z
      // 5e: ifne 65
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: ireturn
      // 67: aload 1
      // 68: aload 0
      // 69: invokevirtual celestial/rfH_2.id_protected ()Lcelestial/rfH_2;
      // 6c: invokestatic celestial/Jo_1.id_byte (Lcelestial/rRq_1;Lcelestial/rfH_2;)Z
      // 6f: ifne 76
      // 72: bipush 1
      // 73: goto 77
      // 76: bipush 0
      // 77: ireturn
      // 78: bipush 0
      // 79: ireturn
   }

   protected void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4) {
   }

   protected xc_3 id_class(rYB var1, rfH_2 var2, xc_3 var3, boolean var4) {
      if (var1.id_continue) {
         return var3;
      } else {
         rCR var5 = var3.id_byte(this.id_implements());
         return new WJ(var1, var2, var3).id_class(var1.id_public(var2), var4, var5).id_byte();
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = super.id_continue();
      rpr_3 var3 = var1.id_case();
      boolean var4 = var3 == rpr_3.EAST || var3 == rpr_3.WEST;
      return var2.id_class(this.id_implements(), var4 ? rCR.EAST_WEST : rCR.NORTH_SOUTH);
   }

   public static boolean id_class(rYB var0, rfH_2 var1) {
      return id_catch(var0.id_byte(var1));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rCR var5 = var1.id_class(this) ? var1.id_byte(this.id_implements()) : null;
      return var5 != null && var5.id_break() ? id_final : id_volatile;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_byte(var2, var3.id_break());
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         this.id_class(var1, var2, var3, var5);
      }
   }

   protected xc_3 id_class(xc_3 var1, rYB var2, rfH_2 var3, boolean var4) {
      var1 = this.id_class(var2, var3, var1, true);
      if (this.id_package) {
         var1.id_class(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5) {
         super.id_break(var1, var2, var3, var4, var5);
         if (var1.id_byte(this.id_implements()).id_break()) {
            var2.id_break(var3.id_final(), this);
         }

         if (this.id_package) {
            var2.id_break(var3, this);
            var2.id_break(var3.id_break(), this);
         }
      }
   }

   public boolean id_break() {
      return this.id_package;
   }

   public static boolean id_catch(xc_3 var0) {
      return var0.id_class(rls_3.id_float) && var0.id_break() instanceof Jo_1;
   }

   public abstract rCZ<rCR> id_implements();

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.NORMAL;
   }
}
