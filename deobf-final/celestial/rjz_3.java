package celestial;

import java.util.function.Predicate;

public class rjz_3 implements rjm_3 {
   protected static final rjm_3 class_ = new rjQ_2(false, -Double.MAX_VALUE, rdy_3.class_, var0 -> false);
   private final boolean break_;
   private final double byte_;
   private final rdb_3 protected_;
   private final Predicate<rXs_1> throws_;

   protected rjz_3(boolean var1, double var2, rdb_3 var4, Predicate<rXs_1> var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   @Deprecated
   protected rjz_3(an_3 var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:745)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:714)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.toJava(FunctionExprent.java:625)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1153)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:902)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual celestial/an_3.rk ()Z
      // 05: aload 1
      // 06: invokevirtual celestial/an_3.re ()D
      // 09: aload 1
      // 0a: instanceof celestial/iB_2
      // 0d: ifeq 1d
      // 10: aload 1
      // 11: checkcast celestial/iB_2
      // 14: invokevirtual celestial/iB_2.ss ()Lcelestial/rdn_3;
      // 17: invokevirtual celestial/rdn_3.break_ ()Lcelestial/rdb_3;
      // 1a: goto 20
      // 1d: getstatic celestial/rdy_3.class_ Lcelestial/rdb_3;
      // 20: aload 1
      // 21: instanceof celestial/iB_2
      // 24: ifeq 38
      // 27: aload 1
      // 28: checkcast celestial/iB_2
      // 2b: dup
      // 2c: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 2f: pop
      // 30: invokedynamic test (Lcelestial/iB_2;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, celestial/iB_2.class_ (Lcelestial/rXs_1;)Z, (Lcelestial/rXs_1;)Z ]
      // 35: goto 3d
      // 38: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, celestial/rjz_3.class_ (Lcelestial/rXs_1;)Z, (Lcelestial/rXs_1;)Z ]
      // 3d: invokespecial celestial/rjz_3.<init> (ZDLcelestial/rdb_3;Ljava/util/function/Predicate;)V
      // 40: return
   }

   @Override
   public boolean class_() {
      return this.break_;
   }

   @Override
   public boolean class_(rjC_2 var1, rfH_2 var2, boolean var3) {
      return this.byte_ > (double)var2.c_() + var1.byte_(rpB_2.Y) - 1.0E-5F;
   }

   @Override
   public boolean class_(rdb_3 var1) {
      return this.protected_ == var1;
   }

   @Override
   public boolean class_(rXE var1, rXB var2) {
      return this.throws_.test(var2) && !var1.class_().class_(var2);
   }
}
