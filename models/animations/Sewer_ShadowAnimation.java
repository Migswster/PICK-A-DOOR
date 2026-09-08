// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.1.6 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class Sewer_ShadowAnimation {
	public static final AnimationDefinition sewer_shadow_living = AnimationDefinition.Builder.withLength(4.0F).looping()
			.addAnimation("tail",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.9583F, KeyframeAnimations.degreeVec(0.0F, -12.24F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, 12.5F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("tail",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.0F, KeyframeAnimations.posVec(1.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.9583F, KeyframeAnimations.posVec(-1.0F, 0.0F, 0.02F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(4.0F, KeyframeAnimations.posVec(1.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}