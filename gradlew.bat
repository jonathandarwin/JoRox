����   2V kotlin/math/MathKt__MathJVMKt  kotlin/math/MathKt__MathHKt  sin (D)D Lkotlin/SinceKotlin; version 1.2 Lkotlin/internal/InlineOnly;     java/lang/Math   
   x D $i$f$sin I cos  
   $i$f$cos tan  
   $i$f$tan asin  
   	$i$f$asin acos   
  ! 	$i$f$acos atan $ 
  % 	$i$f$atan atan2 (DD)D ( )
  * y 
$i$f$atan2 sinh . 
  / 	$i$f$sinh cosh 2 
  3 	$i$f$cosh tanh 6 
  7 	$i$f$tanh asinh kotlin/math/Constants ; taylor_n_bound = 	 < > upper_taylor_n_bound @ 	 < A upper_taylor_2_bound C 	 < D log F 
  G LN2 I 	 < J sqrt L 
  M kotlin/math/MathKt O : 
 P Q abs S 
  T taylor_2_bound V 	 < W result acosh )kotlin/jvm/internal/DoubleCompanionObject [ INSTANCE +Lkotlin/jvm/internal/DoubleCompanionObject; ] ^	 \ _ getNaN ()D a b
 \ c@        atanh hypot h )
  i 
$i$f$hypot 	$i$f$sqrt exp m 
  n $i$f$exp expm1 q 
  r 
$i$f$expm1 base ln $i$f$ln log10 x 
  y 
$i$f$log10 log2 ln1p log1p ~ 
   	$i$f$ln1p ceil � 
  � 	$i$f$ceil floor � 
  � 
$i$f$floor truncate java/lang/Double � isNaN (D)Z � �
 � � 
isInfinite � �
 � � round rint � 
  � 
$i$f$round $i$f$abs sign signum � 
  � 	$i$f$sign min � )
  � a b $i$f$min max � )
  � $i$f$max pow � )
  � 	$this$pow $i$f$pow (DI)D n IEEErem IEEEremainder � )
  � $this$IEEErem divisor $i$f$IEEErem absoluteValue$annotations (D)V getAbsoluteValue $this$absoluteValue $i$f$getAbsoluteValue sign$annotations getSign 
$this$sign $i$f$getSign withSign copySign � )
  � $this$withSign $i$f$withSign ulp$annotations getUlp ulp � 
  � 	$this$ulp $i$f$getUlp nextUp � 
  � $this$nextUp $i$f$nextUp nextDown getNEGATIVE_INFINITY � b
 \ � 	nextAfter � )
  � $this$nextDown $i$f$nextDown nextTowards $this$nextTowards to $i$f$nextTowards 
roundToInt (D)I "java/lang/IllegalArgumentException � Cannot round NaN value. � <init> (Ljava/lang/String;)V � �
 � � java/lang/Throwable �����    (D)J � �
  � $this$roundToInt roundToLong $this$round