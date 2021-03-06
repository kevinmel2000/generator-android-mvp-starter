package <%= appPackage %>.injection.component

import dagger.Component
import <%= appPackage %>.features.base.BaseActivity
import <%= appPackage %>.features.base.BaseFragment
import <%= appPackage %>.injection.ConfigPersistent
import <%= appPackage %>.injection.module.ActivityModule
import <%= appPackage %>.injection.module.FragmentModule

/**
 * A dagger component that will live during the lifecycle of an Activity or Fragment but it won't
 * be destroy during configuration changes. Check [BaseActivity] and [BaseFragment] to
 * see how this components survives configuration changes.
 * Use the [ConfigPersistent] scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = arrayOf(AppComponent::class))
interface ConfigPersistentComponent {

    fun activityComponent(activityModule: ActivityModule): ActivityComponent

    fun fragmentComponent(fragmentModule: FragmentModule): FragmentComponent

}
